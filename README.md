# CricPulse 🏏

A beginner-friendly, interactive ball-by-ball cricket scoreboard built in Java.

## Features
* **Match Format Selection:** Supports **T20** (20 overs), **ODI** (50 overs), and **Test** (unlimited overs).
* **Live Ball-by-Ball Scoring:** Enter runs (`0, 1, 2, 3, 4, 6`), wickets (`W`), or quit (`Q`) directly from the terminal.
* **Automatic Overs Tracking:** Converts total balls into standard cricket overs (e.g., `1.2 / 20 overs`) and announces `--- OVER COMPLETE! ---` after every 6th ball.
* **Auto-End Innings:** Automatically ends the innings when a team is All Out (10 wickets) or completes the maximum overs.

## How to Run
1. Make sure you have **Java (JDK)** installed on your computer.
2. Download `Scoreboard.java` and open it in **VS Code** (or any Java IDE).
3. Click the **Run (`▷`)** button, or run these two commands in your terminal:
   ```bash
   javac Scoreboard.java
   java Scoreboard
