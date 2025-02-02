# Unexpected Loop Termination Bug in Java

This repository demonstrates an uncommon bug in Java involving a loop that terminates prematurely due to an unexpected condition. The code is designed to illustrate a situation where a programmer might inadvertently introduce a condition that causes a loop to stop before its intended completion. 

## Bug Description

A `while` loop is designed to iterate 10 times. However, an `if` condition inside the loop causes it to break when the counter reaches 5. This behavior is not immediately obvious from a simple inspection and may be difficult to debug. 

## Solution

The solution involves reviewing the logic of the loop and the condition that prematurely terminates it. Often, these types of errors are introduced due to coding mistakes or incomplete understanding of the program's requirements.  Thorough testing and code review can help to avoid such unexpected behaviors. 