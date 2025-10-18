# Android Kotlin Lesson 2: Layouts

## Overview
This lesson teaches you the fundamental building blocks of Jetpack Compose layouts: **Row**, **Column**, **Box**, along with concepts like **spacing**, **alignment**, and **weight**.

## What You'll Learn

### 1. **Column** 📊
A layout composable that arranges its children **vertically** (top to bottom).

**Key Properties:**
- `verticalArrangement` - Controls spacing between items (Top, Center, Bottom, SpaceBetween, SpaceAround, SpaceEvenly, spacedBy())
- `horizontalAlignment` - Aligns children horizontally (Start, CenterHorizontally, End)

**Example:**
```kotlin
Column(
    modifier = Modifier.fillMaxWidth(),
    verticalArrangement = Arrangement.spacedBy(8.dp),
    horizontalAlignment = Alignment.CenterHorizontally
) {
    Text("Item 1")
    Text("Item 2")
    Text("Item 3")
}
```

### 2. **Row** ➡️
A layout composable that arranges its children **horizontally** (left to right).

**Key Properties:**
- `horizontalArrangement` - Controls spacing between items (Start, Center, End, SpaceBetween, SpaceAround, SpaceEvenly, spacedBy())
- `verticalAlignment` - Aligns children vertically (Top, CenterVertically, Bottom)

**Example:**
```kotlin
Row(
    modifier = Modifier.fillMaxWidth(),
    horizontalArrangement = Arrangement.spacedBy(8.dp),
    verticalAlignment = Alignment.CenterVertically
) {
    Text("Item 1")
    Text("Item 2")
    Text("Item 3")
}
```

### 3. **Box** 📦
A layout composable that **stacks** its children on top of each other (z-axis layering).

**Key Properties:**
- `contentAlignment` - Default alignment for all children (TopStart, TopCenter, TopEnd, CenterStart, Center, CenterEnd, BottomStart, BottomCenter, BottomEnd)
- Individual children can override with `.align()` modifier

**Example:**
```kotlin
Box(
    modifier = Modifier.size(200.dp)
) {
    Box(Modifier.size(100.dp).background(Color.Red).align(Alignment.TopStart))
    Box(Modifier.size(80.dp).background(Color.Blue).align(Alignment.Center))
    Box(Modifier.size(60.dp).background(Color.Green).align(Alignment.BottomEnd))
}
```

### 4. **Weight** ⚖️
Distributes available space proportionally among children in a Row or Column.

**How it works:**
- Items with `weight(1f)` get equal space
- An item with `weight(2f)` gets twice the space of `weight(1f)`
- Total proportions: If you have weights 1, 2, 1 → they get 25%, 50%, 25% respectively

**Example:**
```kotlin
Row(modifier = Modifier.fillMaxWidth()) {
    Box(Modifier.weight(1f).background(Color.Red))     // 25%
    Box(Modifier.weight(2f).background(Color.Blue))    // 50%
    Box(Modifier.weight(1f).background(Color.Green))   // 25%
}
```

### 5. **Alignment** 🎯
Controls how children are positioned within their parent container.

**Box Alignment Options:**
- `TopStart`, `TopCenter`, `TopEnd`
- `CenterStart`, `Center`, `CenterEnd`
- `BottomStart`, `BottomCenter`, `BottomEnd`

**Column Alignment:**
- `horizontalAlignment`: Start, CenterHorizontally, End

**Row Alignment:**
- `verticalAlignment`: Top, CenterVertically, Bottom

### 6. **Spacing** 📏
Controls the space between and around elements.

**Methods:**
1. **Arrangement.spacedBy(distance)** - Automatic spacing between items
   ```kotlin
   Column(verticalArrangement = Arrangement.spacedBy(16.dp)) { ... }
   ```

2. **Spacer(modifier)** - Manual spacing
   ```kotlin
   Spacer(modifier = Modifier.height(16.dp))  // For Column
   Spacer(modifier = Modifier.width(16.dp))   // For Row
   ```

3. **Padding** - Space around an element
   ```kotlin
   Box(modifier = Modifier.padding(16.dp)) { ... }
   ```

## How to Run This Project

### Prerequisites
- Android Studio (Hedgehog or newer recommended)
- JDK 17 or higher
- Android SDK with minimum API level 24

### Steps
1. Open Android Studio
2. Click "Open" and select this project folder
3. Wait for Gradle sync to complete
4. Click the "Run" button (▶️) or press `Shift + F10`
5. Select an emulator or connected device
6. The app will launch and display the interactive Layout Lesson

## Project Structure
```
app/src/main/java/com/example/androidkotlinlesson2/
├── MainActivity.kt          # Entry point - displays LayoutLessonScreen
├── LayoutLesson.kt          # Main lesson with 6 interactive examples
└── ui/theme/               # App theme configuration
    ├── Color.kt
    ├── Theme.kt
    └── Type.kt
```

## Interactive Examples in the App

When you run the app, you'll see 6 interactive sections:

1. **Column Example** - Shows basic vertical stacking and horizontal alignment
2. **Row Example** - Shows basic horizontal stacking and vertical alignment
3. **Box Example** - Shows layered boxes with different alignments
4. **Weight Example** - Shows equal weights (1:1:1) and different weights (1:2:1)
5. **Alignment Example** - Shows all 9 alignment positions in a Box
6. **Spacing Example** - Shows Arrangement.spacedBy() in action

## Key Concepts to Remember

### Modifier Order Matters
```kotlin
// ✅ Correct - padding outside background
Box(Modifier.background(Color.Red).padding(16.dp))

// ❌ Different result - padding inside background
Box(Modifier.padding(16.dp).background(Color.Red))
```

### Fill vs Size
- `fillMaxWidth()` / `fillMaxHeight()` / `fillMaxSize()` - Fill parent's available space
- `size()` - Set specific dimensions
- `wrapContentSize()` - Size to fit children

### When to Use Each Layout
- **Column** - Vertical lists, forms, stacked content
- **Row** - Horizontal navigation, toolbars, side-by-side items
- **Box** - Overlays, badges, stacked layers, custom positioning

## Tips for Success

1. **Start Simple** - Build your layout step by step
2. **Use Preview** - Add `@Preview` annotations to see changes instantly
3. **Experiment** - Change values and see what happens
4. **Use Background Colors** - Helps visualize layout boundaries during development
5. **Check Modifier Chain** - Order of modifiers affects the final result

## Common Patterns

### Centered Content
```kotlin
Box(
    modifier = Modifier.fillMaxSize(),
    contentAlignment = Alignment.Center
) {
    Text("Centered Text")
}
```

### Header with Body
```kotlin
Column(modifier = Modifier.fillMaxSize()) {
    Text("Header", modifier = Modifier.fillMaxWidth())
    Column(modifier = Modifier.weight(1f)) {
        // Body content takes remaining space
    }
}
```

### Split Screen
```kotlin
Row(modifier = Modifier.fillMaxSize()) {
    Box(modifier = Modifier.weight(1f)) { /* Left half */ }
    Box(modifier = Modifier.weight(1f)) { /* Right half */ }
}
```

## Resources

- [Jetpack Compose Layouts Documentation](https://developer.android.com/jetpack/compose/layouts)
- [Compose Layout Basics](https://developer.android.com/jetpack/compose/layouts/basics)
- [Material Design 3](https://m3.material.io/)

## License
This is an educational project for learning Android Kotlin and Jetpack Compose.

---

**Happy Learning! 🚀**

Experiment with the code, modify the examples, and build your own layouts!

