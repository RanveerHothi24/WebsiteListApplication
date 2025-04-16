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
