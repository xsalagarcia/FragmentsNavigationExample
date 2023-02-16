# FragmentsNavigationExample

## First commit

Simple sample with 3 fragments and navigation component.
- build.gradle application: Added navigation dependencies and fragment dependencies.
- Fragment container with name="androidx.navigation.fragment.NavHostFragment".
- Resource creation (navigation.xml): Resource type = navigation
- In code, calling findNavController() for fragment transition.

## Added Safe Args Example commmit
With Safe Args
- build.gradle application, added pluguin.
- build.gradle project, added classpath.
- add in navigation.xml, in destination fragment attributes -> arguments set the required arguments
- Use actionFragment1ToFragment2()... setting value to send.
- Recover in fragment2 the value with Fragment2Args....
