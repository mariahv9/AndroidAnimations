# Give motion to components with Animations in Android Jetpack Compose

The following research will provide tools to acquire the knowledge and everything necessary to gain new opportunities to create attractive animations that are smooth, responsive, and easy to customize; support to enhance the user experience of mobile applications, give style to our application and even give the surface of a modern application without affecting the fluidity and intuitiveness that users expect to find with the interaction of mobile applications. To achieve this research, we will start by introducing fundamental animation theory with a variety of animations and develop a lab to understand the theory and how the topic works.

Animations with Android Jetpack Compose are a modern feature of mobile applications. It helps users to create a sense of entertainment and improve interaction; The toolkit makes it easy to develop apps to create other effects for different components and attractive animations such as fadeIn, slideIn, expandIn, and others. Allows to specify the animation's duration, delay, size transform, and if you want to set color also. 

Android Jetpack Compose provides a rich group of animation components that can be used to create responsive, and visually appealing animations. Here are some of the animation basics.

## Types of animation

Have diverse types of animations, including drawable, views, and properties animations.

### Tween animation

Is a type that is used to create a smooth transition between two states of a user interface element. The term "tween" comes from the word "in-between," as the animation creates a state between the starting and ending points.
Also, it is created using state functions provided by the animation library. These operations take the initial value of the animated property, the target value, and the animation duration as parameters.

For example, we want an animation of a text box that changes the background smoothly. With the tween function, we create an animationSpec and give to them the states that we need on the animation.

### Spring animation

Is a type of animation to create a natural, bouncy motion. It is often used to provide user interface components a more realistic feel, as the animation nearly simulates the way physical objects move in the real world.
The SpringSpec object contains several effects that can be customized to control the behavior of the animation, including the immobility and damping percentage of the spring. The stiffness determines how fast the animation moves toward its target value, while the damping ratio manipulates how much the animation overshoots or undershoots its target before settling into place.

For example, we have a button and when we click on a text instantly, this works with the spring function that animates this text.

### Keyframe animation

Is a type of animation that allows specifying diverse values for an animated property at different points in time, understood as keyframes. This can be helpful for creating complex animations that involve multiple stages or transitions.
For example, in this case we have a growing and decreasing circle with specific properties that are defined within keyframes.

## Animation specifications

Are used to determine how an animation should behave. They specify the target property that should be animated, the time of the animation, the delay before the animation begins, the easing function that defines how the animation advances over the duration, and other properties such as the repeat count and method.
Animation scopes
Provide animation scopes that let specify the animation's start and end values and control the lifecycle. Animation scopes can be used to determine the animation's duration, delay, and other parameters.

## Conclusions

Animations with Android Jetpack Compose provide developers with a strong tool for developing visually attractive and dynamic user interfaces. With the help of the library, it can easily construct a wide range of animations, including tweens, springs, and keyframe animations.
Also, to add personality and flair to an app's design, animations can be created with less code and greater flexibility than traditional Android frameworks. It's important to use sparingly to avoid the user's distractions from the app's core functionality. Additionally, developers should always keep performance.
While tween animation is simple, spring animation and keyframe animation provide more advanced and flexible properties for creating dynamic animations. The preference of animation type depends on the specific needs of the app and the desired visual effect.

### Bibliography

Animations in compose. (s/f). Android Developers. Recuperado el 4 de mayo de 2023, de https://developer.android.com/jetpack/compose/animation

InfiniteTransition. (s/f). Android Developers. Recuperado el 4 de mayo de 2023, de https://developer.android.com/reference/kotlin/androidx/compose/animation/core/InfiniteTransition

KeyframesSpec. (s/f). Android Developers. Recuperado el 4 de mayo de 2023, de https://developer.android.com/reference/kotlin/androidx/compose/animation/core/KeyframesSpec

Kumar. (2022, mayo 25). Animation in Android Jetpack Compose. SemicolonSpace. https://semicolonspace.com/android-jetpack-compose-animatable/
Tipos de animaciones en Android. (2017, julio 26). 

Platzi. https://platzi.com/blog/animaciones-en-android/
