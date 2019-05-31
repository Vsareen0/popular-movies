package comaniacs.vinamrasareen.popularmoviesstage2.viewmodels;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import comaniacs.vinamrasareen.popularmoviesstage2.database.MovieRepository;
import comaniacs.vinamrasareen.popularmoviesstage2.model.MovieResult;

public class MoviesViewModel extends ViewModel {
    private LiveData<MovieResult> results;

    MoviesViewModel(String filter, String apiKey) {
        if (results != null) {
            return;
        }
        loadFromNetwork(filter, apiKey);
    }

    public void loadFromNetwork(String filter, String apiKey) {
        results = MovieRepository.getInstance().getMovies(filter, apiKey);
    }

    public LiveData<MovieResult> getResults() {
        return results;
    }
}
