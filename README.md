# Milestone 1 – LocalLens (Unit 7)

## Table of Contents
1. [Overview](#Overview)  
2. [Product Spec](#Product-Spec)  
3. [Wireframes](#Wireframes)

## Overview

### Description  
LocalLens is a mobile app that delivers daily location-based photo challenges, encouraging users to explore their city and capture creative photos. Users complete a challenge by taking a picture within a specified area, then view all submitted photos displayed on an interactive map. LocalLens blends creativity, travel, and social discovery into a uniquely mobile experience.

### App Evaluation  
- **Category:** Travel / Lifestyle / Entertainment  
- **Mobile:** Strong mobile-native features — Camera, GPS/Location Services, Maps, Push Notifications  
- **Story:** Encourages users to explore their nearby environment, complete fun photo challenges, and discover creative submissions from others. Easy to understand and engaging.  
- **Market:** Appeals to travelers, college students, local explorers, creatives. Large potential user base with a fun niche.  
- **Habit:** Daily photo challenges plus a map of community submissions encourage frequent engagement and returning use.  
- **Scope:** MVP is very achievable: daily challenge prompt → photo capture & submission → map of results. Optional gamification features can scale later.

## Product Spec

### 1. User Features (Required and Optional)  
**Required Features**  
1. View the Daily Challenge (title, description, radius)  
2. Use the in-app camera screen to take a photo for the challenge  
3. Submit photo with timestamp + location coordinates  
4. View map screen showing pins for submissions  
5. Tap a pin to open a Submission Preview screen  
6. View Profile screen showing completed challenges & submission history  

**Optional Features**  
1. Streak counter (e.g., “You’ve completed 5 days in a row”)  
2. Badge system (e.g., “Explorer”, “Early Bird”)  
3. Like/reaction on other users’ photo submissions  
4. Discovery mode: view all past submissions in the city  
5. Save favorite submissions  
6. Comment on photos  
7. Multiple challenge categories (Art, Nature, Architecture, Food)

### 2. Screen Archetypes  
- **Onboarding Screen**  
  - Explains the app concept  
  - Requests permissions: Camera, Location, Notifications  
- **Home Screen (Daily Challenge)**  
  - Displays today’s challenge (title + description)  
  - Button: “Complete Challenge” → opens Camera  
- **Camera Screen**  
  - In-app camera interface  
  - Retake / Confirm options  
  - Submit button uploads image + location  
- **Map Screen**  
  - Map view with pins for today’s submissions  
  - Tapping a pin opens Submission Preview  
- **Submission Preview**  
  - Displays selected user’s photo  
  - Shows distance from current user, username, timestamp  
- **Profile Screen**  
  - Displays number of completed challenges  
  - Lists past submissions  
  - (If implemented) shows streak badge gallery  

### 3. Navigation  
**Tab Navigation (Tab → Screen)**  
* Home → Daily Challenge  
* Map → Submission Map  
* Profile → User Profile  

**Flow Navigation (Screen → Screen)**  
- Onboarding → Home  
- Home → Camera → Submit → Map  
- Home → Map → Submission Preview  
- Home → Profile → Submission Preview (via past submission)

## Wireframes   
<img src="https://github.com/yelofoot/AND102GroupProject---Tyler-Austin/blob/main/wireframes/wireframe.jpeg?raw=true" width=600>

<br><br>

### [BONUS] Digital Wireframes & Mockups
### [BONUS] Interactive Prototype

## Sprint 1 – Completed User Stories

Use the checklist to mark Sprint 1 progress. Check off the items you finish (`[x]`) and leave the rest unchecked (`[ ]`).

- [ ] View the Daily Challenge (title, description, radius)
- [ ] Use the in-app camera screen to take a photo for the challenge
- [ ] Submit photo with timestamp + location coordinates
- [ ] View map screen showing pins for submissions
- [ ] Tap a pin to open a Submission Preview screen
- [ ] View Profile screen showing completed challenges & submission history

## Sprint 1 Demo

Add sprint demo media to `docs/media/` so they can be embedded below. Record GIFs with tools like QuickTime (screen record) + Gifox/GIF Brewery on macOS, then commit the exported files to the repo.

![Login Demo](docs/media/sprint1-login.gif)
![Dashboard Demo](docs/media/sprint1-dashboard.gif)
