# Lab-A8
This repository contains four programs: Richter Scale, Elevator Simulation, Virtual Reality, and APLine

The RichterScale program has a method named getEffect, and It is used for getting the effect of a earthquake with a specific magnitude.


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


The Elevator program allows users to choose a floor. It utilizes if statements for input validation. 
The following are illegal inputs:
The number 13
Zero or a negative number
A number larger than 20
An input that is not a sequence of digits, such as five

Sample Output:
Floor: 5
Thank you, I will take you to the actual floor 5
Floor: 16
Thank you, I will take you to the actual floor 15
Floor: 21
Error: The floor must be between 1 and 20
Floor: -2
Error: The floor must be between 1 and 20
Floor: 0
Error: The floor must be between 1 and 20
Floor: six
Error: Not an integer  


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

Virtual Reality - A. 8.3 
You will be developing a Virual Reality tool for engineers who create satellites and spacecraft. One of the biggest challenges in modern VR applications is maintaining high enough performance to avoid reprojection. Reprojection is an algorithm for maintaining a responsive VR experience when performance is low, but causes a number of undesired artifacts such as judder (which can cause motion sickness). Due to the amount of data your VR application will be displaying, you have decided to implement an adaptive quality algorithm to minimize reprojection.

Typically, a VR application needs to generate 90 frames (images) per second to maintain a smooth experience. This gives the system approximately 11.1 milliseconds to process each frame. You will be given the time (in milliseconds) that the system took to render each of the previous 3 frames, and the current quality level. Your program should print the quality level to be used by the VR application for the next frame.

Adaptive Quality Algorithm
Your program will need to decide what to do based on the previous three frame processing times. You will have following four data points:

Frame0 = Two frames ago (ms)
Frame1 = Frame before last (ms)
Frame 2 = Last frame (ms)
Quality level = ranges from 1 to 10
 

Since your VR program would like to have at least 90 frames per second, the target time per frame is:


Your algorithm will also take into account the following threshold values:

Low_Threshold = 70% x TargetFrameTime
Extrapolate_Threshold = 70% x TargetFrameTime
High_Threshold = 90% x TargetFrameTime
 

Your program should implement the following quality algorithm:

If the last frame was critical (greater than the high threshold), reduce the quality level by 2.
Otherwise if the last frame was greater that the extrapolate threshold, calculate the linear extrapolation values for the two lines through frame 2 (the first is frame 0 to frame 2, the second is frame1 to frame2). The formula given below may be helpful to you. If the maximum of those two values is greater than the high threshold, reduce the quality level by 2.
Otherwise, if all three of the previous frames have values less that the low threshold, increase the quality level by 1.
Otherwise, keep the quality level the same.
 


Where (x1,y1) and (x2, y2) are the known frame data points

Consider the first example input below. If we consider the first data point to be time 0, the second to be time 1, and the third to be time 2, then we can extrapolate the value for time 3 two different ways:

The first way, we use times 0 and 2 to predict the value for time 3 would be 10.25.
The second way, we use times 1 and 2 to predict the value for time 3 would be 10.3.
For our calculations, we use the larger, which is 10.3. 



////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


An APLine is a line defined by the equation ax + by + c = 0 , where a is not equal to zero, b is not equal to zero, and a, b, and c are all integers. The slope of an APLine is defined to be the double value -a / b. A point (represented by integers x and y) is on an APLine if the equation of the APLine is satisfied when those x and y values are substituted into the equation. That is, a point represented by x and y is on the line if ax + by + c is equal to 0. Examples of two APLine equations are shown in the following table.


Equation	Slope (-a/b)	Is point (5, -2) on the line?
5x + 4y - 17 = 0	-5 / 4 = -1.25	Yes, because 5(5) + 4(-2) + (-17) = 0
-25x + 40y + 30 = 0	25 / 40 = 0.625	No, because -25(5) + 40(-2) + 30 != 0
Assume that the following code segment appears in a class other than APLine. The code segment shows an example of using the APLine class to represent the two equations shown in the table.


APLine line1 = new APLine(5, 4, -17);
double slope1 = line1.getSlope(); // slope1 is assigned -1.25
boolean onLine1 = line1.isOnLine(5, -2); // true because 5(5) + 4(-2) + (-17) = 0
APLine line2 = new APLine(-25, 40, 30);
double slope2 = line2.getSlope(); // slope2 is assigned 0.625
boolean onLine2 = line2.isOnLine(5, -2); // false because -25(5) + 40(-2) + 30 != 0

Write the APLine class. Your implementation must include a constructor that has three integer parameters that represent a, b, and c, in that order. You may assume that the values of the parameters representing a and b are not zero. It must also include a method getSlope that calculates and returns the slope of the line, and a method isOnLine that returns true if the point represented by its two parameters (x and y, in that order) is on the APLine and returns false otherwise. Your class must produce the indicated results when invoked by the code segment given above. You may ignore any issues related to integer overflow. Here is a sample output for the above code.


Slope of line1: -1.25
Point (5,-2) is on line: true
Slope of line2: 0.625
Point (5,-2) is on line: false
