# WebsiteListApplication

## Overview
This is a simple Android app that fetches a list of websites from a provided API, displays them in a RecyclerView, and allows sorting by name. Each website is displayed with an icon, name, and description.

## Features
- Displays a list of websites in a RecyclerView.
- Sort websites by name using a button.
- Uses Retrofit for API calls, Coil for image loading, and ViewModel/LiveData for data management.

## Requirements
- Android SDK 24 or higher.
- Internet connection for API calls.

## How to Build and Run
1. Clone the repository.
2. Open in Android Studio.
3. Sync project with Gradle.
4. Run on an emulator or device (API 24+).

## Tests
- Unit test: `WebsiteModelTest.kt` (tests the `Website` data class).
- Run tests via `./gradlew testDebugUnitTest`.

## Approach
- I started by setting up Retrofit to fetch the website data from the provided URL.
- I used a RecyclerView to display the list.
- For the bonus features, I added a sort button to sort the list by name and tried to load the icons. I also wrote a simple unit test.
- I kept the app simple since I’m new to Android development, focusing on the core requirements and adding a few bonus features.

## What I’m Proud Of
- I managed to get the app working with Retrofit and display the list, even though I’m new to Android.
- Adding the sort feature and the unit test was challenging but rewarding.

## What I Would Improve
- I would fix the icon loading so all websites show their correct icons.
- I wouldd add error handling to show a message if the data fails to load.
- With more time, I’d improve the UI design and add more tests.

## Notes
- I tried loading icons from favicon URLs (e.g., `https://www.google.com/favicon.ico`), but many failed to load due to network issues on the emulator. Only Reddit, Wikipedia, and X icons load. Since displaying icons is a bonus, I left it as-is.
- I’m new to mobile development, so I focused on keeping the implementation simple while meeting the core requirements. I learned a lot through this task and am eager to discuss my approach in the next stage.
