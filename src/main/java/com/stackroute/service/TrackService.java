package com.stackroute.service;

import com.stackroute.domain.Track;
import com.stackroute.exceptions.TrackAlreadyExistsException;
import com.stackroute.exceptions.TrackNotFoundException;

import java.util.List;

public interface TrackService {

    public Track saveTrack(Track track) throws TrackAlreadyExistsException;

    public Track getTrackById(int id) throws TrackNotFoundException;

    public List<Track> getAllTracks();

    public Track deleteTrackById(int id) throws TrackNotFoundException;

    public Track updateTrackById(Track track, int id);

    public List<Track> getTrackByName(String name) throws TrackNotFoundException;

}