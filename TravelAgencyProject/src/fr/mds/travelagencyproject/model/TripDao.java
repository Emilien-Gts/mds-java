package fr.mds.travelagencyproject.model;

public interface TripDao {
	Long createTrip(Trip t);
	Trip findTripById(Long id);
	void removeTrip(Long id);
}
