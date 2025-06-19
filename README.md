NAME: TAU PHUMELELO
STUDENT NUMBER: ST10492650

 1. App Overview

The Music Playlist Manager app provides a simple yet effective way for users to curate their music collections. It's designed to be intuitive, allowing for quick song entry and easy review of the entire playlist. The application adheres to modern Android development practices, ensuring a smooth user experience.

The app supports managing playlists for up to four distinct artists (as per the sample data provided in the prompt), with functionality to add more as needed.

## 2. Features

The application implements the following core functionalities:

*Add Song to Playlist:
    * Users can input the song title, artist name, a rating (1-5), and optional comments.
    * Input validation ensures that required fields are filled and the rating is within the valid range (1-5).
*View Playlist Details:
    * Displays a comprehensive list of all songs added to the playlist, showing their title, artist, rating, and comments.
    * The list is presented clearly, allowing users to scroll through their entire collection.
*Calculate Average Rating:
    * Provides a button to instantly calculate and display the average rating of all songs currently in the playlist.
*Navigation:
    * Seamless transition between the Main Screen (for adding songs) and the Detailed View Screen (for viewing and analyzing the playlist).
    * A dedicated "Exit App" button on the main screen to gracefully close the application.

 3. Technical Details

The application is built using Kotlin for Android development and leverages Android Studio's standard tools and libraries.

*Programming Language: Kotlin
*Android SDK: (Mention your `minSdk` and `targetSdk` from `build.gradle` here, e.g., `minSdk 24`, `targetSdk 34`)
*Architecture:* Uses a basic Activity-based architecture with explicit `Intent` for navigation and data passing.
  *Data Storage (In-memory):** Song data (title, artist, rating, comments) is stored in an `ArrayList` of `Song` data class objects. The `Song` data class implements `Parcelable` to allow efficient passing of data between activities.
  *Note: For persistent data storage (data remains after app is closed), a database (e.g., Room) or SharedPreferences would be used in a production environment. For this assignment, in-memory storage suffices.
  *UI Layouts: XML layout files (`activity_main.xml`, `activity_detailed_view.xml`) are designed using `ConstraintLayout` for flexible and responsive UI.
  *Error Handling:** Basic input validation is implemented for user-entered data (e.g., ensuring ratings are numeric and within range). User-friendly `Toast` messages and `AlertDialog` provide feedback.

4. How to Run the App

1. Prerequisites:
    * Android Studio (Flamingo or newer recommended)
    * Kotlin Plugin for Android Studio
    * An Android device or emulator running Android API (mention your `minSdk` here, e.g., 24) or higher.
2. Clone the Repository:
    ```bash
    cd MusicPlaylistManagerApp
    ```
3. Open in Android Studio:
    * Launch Android Studio.
    * Select "Open an existing Android Studio project" and navigate to the cloned `MusicPlaylistManagerApp` directory.
4. Sync Gradle:
    * Android Studio should automatically sync the project. If not, click "Sync Project with Gradle Files" (elephant icon in the toolbar).
5. Run on Device/Emulator:
    * Connect an Android device with USB Debugging enabled, or select an AVD (Android Virtual Device) from the device dropdown.
    * Click the "Run" button (green play icon) in the toolbar.

## 5. Screenshots

*Main Screen:
Screenshot_20250619_110139.png
this sreenshot shows the primary entry piont of application. It features input fields for "Song Tittle, Artist Name, Rating(1-5) and Comment  Below input you can see the three main action buttons: Add to playlist,View playlist Details and exit app

*Detailed View Screen:
Screenshot_20250619_105827.png
this screenshoots dispaly DetailedScreen. it represent a scrollable list of all song currently in the playlist, showing each song tittle, artist, and any assiciated comment.at the button there are buttons for Calculate Avarage Rating and Back to Main


## 7. Error Handling and User Feedback

*Input Validation: Checks are performed to ensure all mandatory input fields (Song Title, Artist Name, Rating) are not empty.
*Rating Validation: The entered rating is validated to be a number between 1 and 5.
*Constructive Feedback: If the rating input is invalid, an `AlertDialog` is displayed to inform the user about the error and ask if they wish to fix it, aligning with the prompt's requirement for constructive feedback.
*User Notifications: `Toast` messages are used to confirm successful song additions and average rating calculations, or to prompt the user about missing input.

## 8. Known Issues / Future Enhancements

*Persistence:* Currently, all data is lost when the app is completely closed (process killed). Future enhancements would involve implementing persistent storage using Room database or SharedPreferences.
*Edit/Delete Songs:* Functionality to modify or remove existing songs from the playlist could be added.
*Sorting/Filtering:* Options to sort the playlist by title, artist, or rating, or to filter by artist.
*UI/UX Improvements:* Enhance the visual design and user experience, possibly using `RecyclerView` for a more efficient and customizable list display in the Detailed View.
*Artist Management:* A dedicated section for managing artists (adding new artists, viewing artist-specific playlists).

https://github.com/P6000/mymusic
