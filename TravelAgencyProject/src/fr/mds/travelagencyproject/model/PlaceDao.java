package fr.mds.travelagencyproject.model;

public interface PlaceDao {
	long createPlace(Place p);
	Place findPlaceById(Long id);
	void updatePlace(Place p);
	void removePlace(Long id);
}
