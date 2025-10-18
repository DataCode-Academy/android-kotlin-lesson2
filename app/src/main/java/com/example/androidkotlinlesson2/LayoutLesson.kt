package com.example.androidkotlinlesson2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LayoutLessonScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        // Title
        Text(
            text = "Lesson 2: Layouts",
            style = MaterialTheme.typography.headlineMedium,
            fontWeight = FontWeight.Bold
        )

        // Section 1: Column
        ColumnExample()

        // Section 2: Row
        RowExample()

        // Section 3: Box
        BoxExample()

        // Section 4: Weight
        WeightExample()

        // Section 5: Alignment
        AlignmentExample()

        // Section 6: Spacing
        SpacingExample()
    }
}

@Composable
fun ColumnExample() {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            text = "1. Column",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF1976D2)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Arranges children vertically",
            style = MaterialTheme.typography.bodyMedium,
            color = Color.Gray
        )
        Spacer(modifier = Modifier.height(12.dp))

        // Example 1: Basic Column
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFE3F2FD), RoundedCornerShape(8.dp))
                .padding(16.dp)
        ) {
            Text("Item 1", fontSize = 16.sp)
            Text("Item 2", fontSize = 16.sp)
            Text("Item 3", fontSize = 16.sp)
        }

        Spacer(modifier = Modifier.height(12.dp))

        // Example 2: Column with alignment
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFE8F5E9), RoundedCornerShape(8.dp))
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Start (default)", modifier = Modifier.align(Alignment.Start))
            Text("Center Horizontally")
            Text("End", modifier = Modifier.align(Alignment.End))
        }
    }
}

@Composable
fun RowExample() {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            text = "2. Row",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF1976D2)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Arranges children horizontally",
            style = MaterialTheme.typography.bodyMedium,
            color = Color.Gray
        )
        Spacer(modifier = Modifier.height(12.dp))

        // Example 1: Basic Row
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFFFF9C4), RoundedCornerShape(8.dp))
                .padding(16.dp)
        ) {
            Text("Item 1")
            Spacer(modifier = Modifier.width(8.dp))
            Text("Item 2")
            Spacer(modifier = Modifier.width(8.dp))
            Text("Item 3")
        }

        Spacer(modifier = Modifier.height(12.dp))

        // Example 2: Row with alignment
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp)
                .background(Color(0xFFFCE4EC), RoundedCornerShape(8.dp))
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text("Top", modifier = Modifier.align(Alignment.Top))
            Spacer(modifier = Modifier.width(16.dp))
            Text("Center")
            Spacer(modifier = Modifier.width(16.dp))
            Text("Bottom", modifier = Modifier.align(Alignment.Bottom))
        }
    }
}

@Composable
fun BoxExample() {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            text = "3. Box",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF1976D2)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Stacks children on top of each other",
            style = MaterialTheme.typography.bodyMedium,
            color = Color.Gray
        )
        Spacer(modifier = Modifier.height(12.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .background(Color(0xFFE0E0E0), RoundedCornerShape(8.dp))
        ) {
            // Background layer
            Box(
                modifier = Modifier
                    .size(120.dp)
                    .background(Color(0xFFFFCC80), RoundedCornerShape(8.dp))
                    .align(Alignment.TopStart)
            )

            // Middle layer
            Box(
                modifier = Modifier
                    .size(80.dp)
                    .background(Color(0xFF90CAF9), RoundedCornerShape(40.dp))
                    .align(Alignment.Center)
            )

            // Front layer
            Box(
                modifier = Modifier
                    .size(60.dp)
                    .background(Color(0xFFB39DDB), RoundedCornerShape(8.dp))
                    .align(Alignment.BottomEnd)
            )

            // Text labels
            Text("Top Start", modifier = Modifier.align(Alignment.TopStart).padding(8.dp))
            Text("Center", modifier = Modifier.align(Alignment.Center))
            Text("Bottom End", modifier = Modifier.align(Alignment.BottomEnd).padding(8.dp))
        }
    }
}

@Composable
fun WeightExample() {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            text = "4. Weight",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF1976D2)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Distributes space proportionally",
            style = MaterialTheme.typography.bodyMedium,
            color = Color.Gray
        )
        Spacer(modifier = Modifier.height(12.dp))

        // Example 1: Equal weights
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize()
                    .background(Color(0xFFBBDEFB), RoundedCornerShape(6.dp)),
                contentAlignment = Alignment.Center
            ) {
                Text("1f", color = Color.Black, fontWeight = FontWeight.Bold)
            }

            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize()
                    .background(Color(0xFF90CAF9), RoundedCornerShape(6.dp)),
                contentAlignment = Alignment.Center
            ) {
                Text("1f", color = Color.Black, fontWeight = FontWeight.Bold)
            }

            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize()
                    .background(Color(0xFF64B5F6), RoundedCornerShape(6.dp)),
                contentAlignment = Alignment.Center
            ) {
                Text("1f", color = Color.Black, fontWeight = FontWeight.Bold)
            }
        }

        Spacer(modifier = Modifier.height(12.dp))

        // Example 2: Different weights
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize()
                    .background(Color(0xFFC8E6C9), RoundedCornerShape(6.dp)),
                contentAlignment = Alignment.Center
            ) {
                Text("1f", color = Color.Black, fontWeight = FontWeight.Bold)
            }

            Box(
                modifier = Modifier
                    .weight(2f)
                    .fillMaxSize()
                    .background(Color(0xFFA5D6A7), RoundedCornerShape(6.dp)),
                contentAlignment = Alignment.Center
            ) {
                Text("2f (wider)", color = Color.Black, fontWeight = FontWeight.Bold)
            }

            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize()
                    .background(Color(0xFF81C784), RoundedCornerShape(6.dp)),
                contentAlignment = Alignment.Center
            ) {
                Text("1f", color = Color.Black, fontWeight = FontWeight.Bold)
            }
        }
    }
}

@Composable
fun AlignmentExample() {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            text = "5. Alignment",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF1976D2)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Positioning children within layout",
            style = MaterialTheme.typography.bodyMedium,
            color = Color.Gray
        )
        Spacer(modifier = Modifier.height(12.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(180.dp)
                .background(Color(0xFFF3E5F5), RoundedCornerShape(8.dp))
        ) {
            Box(
                modifier = Modifier
                    .size(40.dp)
                    .background(Color(0xFFCE93D8), RoundedCornerShape(20.dp))
                    .align(Alignment.TopStart)
            )
            Box(
                modifier = Modifier
                    .size(40.dp)
                    .background(Color(0xFFBA68C8), RoundedCornerShape(20.dp))
                    .align(Alignment.TopCenter)
            )
            Box(
                modifier = Modifier
                    .size(40.dp)
                    .background(Color(0xFFAB47BC), RoundedCornerShape(20.dp))
                    .align(Alignment.TopEnd)
            )
            Box(
                modifier = Modifier
                    .size(40.dp)
                    .background(Color(0xFF9C27B0), RoundedCornerShape(20.dp))
                    .align(Alignment.CenterStart)
            )
            Box(
                modifier = Modifier
                    .size(40.dp)
                    .background(Color(0xFF8E24AA), RoundedCornerShape(20.dp))
                    .align(Alignment.Center)
            )
            Box(
                modifier = Modifier
                    .size(40.dp)
                    .background(Color(0xFF7B1FA2), RoundedCornerShape(20.dp))
                    .align(Alignment.CenterEnd)
            )
            Box(
                modifier = Modifier
                    .size(40.dp)
                    .background(Color(0xFF6A1B9A), RoundedCornerShape(20.dp))
                    .align(Alignment.BottomStart)
            )
            Box(
                modifier = Modifier
                    .size(40.dp)
                    .background(Color(0xFF4A148C), RoundedCornerShape(20.dp))
                    .align(Alignment.BottomCenter)
            )
            Box(
                modifier = Modifier
                    .size(40.dp)
                    .background(Color(0xFF311B92), RoundedCornerShape(20.dp))
                    .align(Alignment.BottomEnd)
            )
        }
    }
}

@Composable
fun SpacingExample() {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            text = "6. Spacing",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF1976D2)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Adding space between elements",
            style = MaterialTheme.typography.bodyMedium,
            color = Color.Gray
        )
        Spacer(modifier = Modifier.height(12.dp))

        // Using Arrangement.spacedBy
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFFFE0B2), RoundedCornerShape(8.dp))
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Text("Using Arrangement.spacedBy(12.dp):", fontWeight = FontWeight.Bold)
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(40.dp)
                    .background(Color(0xFFFFCC80), RoundedCornerShape(4.dp)),
                contentAlignment = Alignment.Center
            ) {
                Text("Item 1")
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(40.dp)
                    .background(Color(0xFFFFB74D), RoundedCornerShape(4.dp)),
                contentAlignment = Alignment.Center
            ) {
                Text("Item 2")
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(40.dp)
                    .background(Color(0xFFFFA726), RoundedCornerShape(4.dp)),
                contentAlignment = Alignment.Center
            ) {
                Text("Item 3")
            }
        }

        Spacer(modifier = Modifier.height(12.dp))

        // Using padding
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFB2DFDB), RoundedCornerShape(8.dp))
                .padding(16.dp)
        ) {
            Text("Using padding:", fontWeight = FontWeight.Bold)
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LayoutLessonPreview() {
    LayoutLessonScreen()
}

