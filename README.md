# Example of Kotlin for Android app development

## Libraries used:
- **Retrofit 2.0**: To consume public Reddit API.
- **RxJava(RxAndroid)**: We will use Observables to decouple the UI thread with our background tasks. In this case to call the API and return this values to the UI.
- **Picasso**: Load images from Reddit.
- **RecyclerView**: We will use the RecyclerView to present the information and also to provide the infinite scroll behaviour.
- **Dagger 2**: Dependency Injection.
- **Mockito**: Unit Test

## Plugins used:
- **Kotlin Android Extensions**: To bind the UI (Views) with code.
- **Parceable Code Generator (for kotlin)**: To make data class parceable automatically (by generating code).

## Groovy tech used:
- Version
- Product flavor
- Apk signature
- Proguard depending on build type
- JDK compile options
- Find bugs
- Code coverage
- Lint options
- pmd
