# Example of Kotlin for Android app development

## Libraries used:
- [**Retrofit 2.0**](https://github.com/square/retrofit) & _converter-moshi_: To consume public API and to convert JSON into Java/Kotlin class.
- **[RxJava](https://github.com/ReactiveX/RxJava)([RxAndroid](https://github.com/ReactiveX/RxAndroid))**: We will use Observables to decouple the UI thread with our background tasks. In this case to call the API and return this values to the UI.
- [**Picasso**](https://github.com/square/picasso): Load images from Reddit.
- **RecyclerView**: We will use the RecyclerView to present the information and also to provide the infinite scroll behaviour.
- [**Dagger 2**](https://github.com/google/dagger): Dependency Injection.
- [**Mockito**](http://site.mockito.org/): Unit Test
- [**Spek**](http://spekframework.org/): Unit Test (specifically)

## Plugins used:
- **Kotlin Android Extensions**: To bind properties to an element of a view.
- [**Parceable Code Generator (for kotlin)**](https://github.com/nekocode/android-parcelable-intellij-plugin-kotlin): To make data class parceable automatically (by generating code).

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
