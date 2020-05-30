# README #

**Names:**	Sarbesh , Nameer , Sriram 

**Group:** 5

**Period:**	1

**Game Title:** Your Title (can always change it later)

## Game Proposal ##

Write a paragraph here describing the game you want to make.  Describe how it is played and which features
you want to include in your game.  Remember, any simple game can be scaled up with features and any complex
game can be scaled down.

A astroid shooter game, with multipile levels and enemies. And a boss at the very end.

Game Controls:

Use mouse for movement and mouse click to shoot. 

Game Elements:

Multiple levels,kill enemies, kill boss

How to Win:

Kill the boss in the last level.

## Link Examples ##
Provide links to examples of your game idea.  This can be a playable online game, screenshots, YouTube videos of gameplay, etc.

+ [Example Link](http://www.freewebarcade.com/game/tiny-empire/)

## Teacher Response ##

Approved | Not approved

Comments and suggestions

## Class Design and Brainstorm ##

Put all your brainstorm ideas, strategy approaches, and class outlines here

## Development Journal ##

Sarbesh 5/20/2020 (25 minutes)

New clases minor bugs, very minimal things

Sarbesh 5/21/2020 (15 minutes)

Added astroid component, play movement works well, problem with laser, hoping to fix that

Sarbesh 5/22/2020 (10 minutes)

Scaling images work well, reduced the sizes, need to get the actual game mechanics working

Sarbesh 5/23/2020 (20 minutes)

Continue working on on astroid issues, hoping to add levels and some new enemies

Sarbesh 5/24/2020 (4 hours)

Finished the whole base of the game. Removed some classes, made the code much simpler and easy to read. Rotation works well, with keyboard. I incoprated a whole start and instruction screen with texts
that are very specific and easy to read. Added 3 levels to the game. Hoping to make each level differnt for the next day

Sarbesh 5/25/2020 (6 hours)

Different components in each level. Astroids are slower, in level 1. Added a whole new enemy that appears in level 2, the alien. The alien is a the same speed as the astroid, but there's a 1 percent chance
each frame that the alien will spawn an evil laser. In level 3 I added a boss, with a health bar. It doesn't do anything yet. But everytime you hit the boss, the healthbar will decrease. I also added a counter
with the score, and differnt texts that show what level your on. I added a game over screen and a win screen if you defeat the boss. Massive push that I made, and has the game pretty much done. Hoping to make the movement of player better.

Sarbesh 5/26/2020(20 minutes)

We changed the player movement, and used mouse to move and mouse click to shoot. We scaled some of the enmies so it looks better. Hoping to add an extra level and other features.

Sarbesh 5/27/2020 (30 minutes)

Fixed some astroid problems, also fixed some null exception errors, game runs smoothly. Boss also has movement and can shoot back as well.

Sarbesh 5/28/2020 (10 minutes)

Fixed laser shooting hoping to add some more things like a moving background, and possibly some lives.

Sarbesh 5/29/2020 

***
***

# README #

**Names:**	Nameer, Sriram, and Sarbesh

**Group:** 5

**Period:**	1

**Game Title:** Asteroids

## Game Proposal ##

Our game is Asteroids, which is an arcade game in which asteroids fall from the top and the player has to shoot lasers to destroy the Asteroids. 
There are multiple levels, and the final level will be a boss level that shoots lasers too. Levels get progressively harder, with the points and the toughness increasing with every level.

Game Controls:

+WASD to move
+Mouse to rotate and shoot lasers.

Game Elements:

+Asteroids spawn in on top randomly
+ Beginning asteroids are slow, big and easy to shoot.
+To progress to the next level, one needs to get a specific number of points.
+As the levels inrcrease, the Asteroids become smaller, faster, and harder to shoot.
+Aliens have a 5% chance to spawn during the boss level, and shoots  lasers too.
+ There are 3 levels, with the 3rd level being the boss fight.

How to Win:

+The boss has a healthbar, which ends the game once it is 0.

## Link Examples ##
Provide links to examples of your game idea.  This can be a playable online game, screenshots, YouTube videos of gameplay, etc.


## Teacher Response ##

Approved | Not approved

Comments and suggestions

## Class Design and Brainstorm ##

in general, classes

## Development Journal ##

18th May - Made minor improvements to Player class, still need to understand how to push and pull code.
20th May - Scaled images, made new classes, and fixed minor bugs.
21st May - Very significant change in Laser class, something which had been bugging me for so long.
23rd May - Made changes to player rotation.
25th May - Thought of many new ideas to be implemented later, as for now, game is solid and functioning well, but still not up to the mark.
27th May - Finally fixed Asteroid spawning issue, implemented  new features such as Boss movement. Idea to use new images.
28th May - Fixed Boss Laser Issue, though it still spawns too much. 
**Nameer - 18th May (10 minutes)**

Goal: Modify Player class and add more classes. Understand bitbucket fully, including how to pull and push code.

Work accomplished:  Fixed minor bugs and successfully modified Player, added new class Centipede that does nothing so far.

**Nameer - 20th May (10 minutes)**

Goal:  Scale images accordingly to provide a sleek finish. Make new states that will serve as title screens, game over screens, etc. Modify code in general

Work accomplished:  Scaled images and made minor changes.Couldn't make the intended states to work, but did modify various classes.
	 
**Nameer - 21st May (40 minutes)**

Goal: Fix problem of lasers spawning in indefinitely when holding spacebar down. Also fix player rotation and movement. Instead of player staying only in the bottom 20%,
make sure player moves in all directions and rotates in all directions too. Also, fix problems of Asteroid spawning in randomly in no order. 
Fix Asteroid Spawn problem and Laser spawn problem. Also, make a laser counter that shows how many lasers are left, and a Player life counter that gets reduced by one,
on Asteroid collision. Make a Laser counter and a Player life counter that gets reduced by one after every collision with Asteroid.

Work accomplished: Finally fixed Laser spawning problem. Turns out the solution was pretty simple. Lasers still need to spawn according to the player angle, 
and also Asteroid spawn problem still unsolved. Somewhat fixed the Asteroid spawn problem, but laser counter and Player Life counter still pose a potential problem.

**Nameer - 23rd May (15 minutes)**

Goal: Change background and assign images to actors. Fix player rotation, such that AD keys turn the player left and right accordingly.

Work accomplished: The player turns 10 degrees to the left or right with key press. Though this is still uncomfortable. Looking for a better solution

**Nameer - 25th May (40 minutes)**

Goal: Since a lot of work has been done on coding, see the project as a whole and resolve bugs in general. Player should now roatate with mouse movement, 
and lasers should spawn and shoot in the direction of the player. Make player life and score counter to keep track of score.
So far, three levels are there, and even though they work, they need to be modified a but more, especially the boss level. 
Fix Title Screen, Game State, and GameOver screen such that they function smoothly.

Work accomplished: Player now rotates according to mouse movement, took some time but after research and trial and error, the dilemma has beem finally resolved.
Now, only the laser and boss movememnt remain. Finally fixed score counter, and Sarbesh resolved the Laser angle spawning.

**Nameer - 27th May (1 hour+)**

Goal: Fix boss movement, boss Laser shooting, and Alien movement. Boss should shoot lasers if a random number less than 100 is less than 5. Change other class attributes such as Asteroid, 
Alien Laser, and others. 

Work accomplished: Made significant changes to the game classes, especially the Asteroid ones. Renamed the classes and fixed Asteroid spawning issue.

**Nameer - 28th May (1 hour+)**

Goal: Fix Boss Laser shooting, add Points and Alien Shooting action.

Work accomplished: Fixed Boss Laser shooting, and others, but still have many many more ideas. To be continued

***
***