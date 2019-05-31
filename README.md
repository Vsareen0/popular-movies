# Popular-movies

## Information
- Allow users to view and play trailers ( either in the youtube app or a web browser).
- Allow users to read reviews of a selected movie.
- Also allow users to mark a movie as a favorite in the details view by tapping a button(star).
- Create a database to store the names and ids of the user's favorite movies (and optionally, the rest of the information needed to display their favorites collection while offline).
- Modify the existing sorting criteria for the main view to include an additional pivot to show their favorites collection.

![](https://lh3.googleusercontent.com/BTqI5BekJulDrHapAT5-CvikbF_3M9BBs3bkGuoiWtx0fOt7SqHZ_1jVLtV8OqLura1nShr12VwJ-LGsEb0=s0#w=301&h=535)

#### Common Project Requirements
- [x] App is written solely in the Java Programming Language.

- [x] App conforms to common standards found in the Android Nanodegree General Project Guidelines.

- [x] App utilizes stable release versions of all libraries, Gradle, and Android Studio.

#### User Interface - Layout
- [x] UI contains an element (e.g., a spinner or settings menu) to toggle the sort order of the movies by: most popular, highest rated.

- [x] Movies are displayed in the main layout via a grid of their corresponding movie poster thumbnails.

- [x] UI contains a screen for displaying the details for a selected movie.

- [x] Movie Details layout contains title, release date, movie poster, vote average, and plot synopsis.

- [x] Movie Details layout contains a section for displaying trailer videos and user reviews.

#### User Interface - Function
- [x] When a user changes the sort criteria (most popular, highest rated, and favorites) the main view gets updated correctly.

- [x] When a movie poster thumbnail is selected, the movie details screen is launched.

- [x] When a trailer is selected, app uses an Intent to launch the trailer.

- [x] In the movies detail screen, a user can tap a button (for example, a star) to mark it as a Favorite. Tap the button on a favorite movie will unfavorite it.

#### Network API Implementation
- [x] In a background thread, app queries the /movie/popular or /movie/top_rated API for the sort criteria specified in the settings menu.

- [x] App requests for related videos for a selected movie via the /movie/{id}/videos endpoint in a background thread and displays those details when the user selects a movie.

- [x] App requests for user reviews for a selected movie via the /movie/{id}/reviews endpoint in a background thread and displays those details when the user selects a movie.

#### Data Persistence
- [x] The titles and IDs of the user’s favorite movies are stored in a native SQLite database and exposed via a ContentProvider
OR
- [x] stored using Room.

- [x] Data is updated whenever the user favorites or unfavorites a movie. No other persistence libraries are used.

- [x] When the "favorites" setting option is selected, the main view displays the entire favorites collection based on movie ids stored in the database.

#### Android Architecture Components
- [x] If Room is used, database is not re-queried unnecessarily. LiveData is used to observe changes in the database and update the UI accordingly.

- [x] If Room is used, database is not re-queried unnecessarily after rotation. Cached LiveData from ViewModel is used instead.
