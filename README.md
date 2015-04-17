#Project: Ghost
##Summary: This project is based on the game Ghost.
The normal variant of the game requires two or more competing players. Each player has to pick a letter, clockwise, the first player  
 to complete a word after 3 letters loses the round.  
  
You usually play this game with 2 players. An extra feature of the game, and of which the game name originates, is that when a player  
has lost 5 rounds, it becomes a ghost (on letter for each time the player loses a round, thus G-H-O-S-T). A ghost can talk to players  
who still have not lost, if an active player talks back to the ghost the active player himself turns into a ghost. This feature is  
not implemented in the game however. The last active player wins the game.

The game has mary variants. Which make it possible to either insert a letter anywhere or for example mirror the word so that the  
beginning of the word becomes the end.

For more information about the rules of the game and how to game originated [ghost on wikipedia](http://en.wikipedia.org/wiki/Ghost_%28game%29)

##Specification
These games will be playable:
* Superghost
* Superduperghost
* Xghost
* Spook

These will be the possible settings

* set number of players (default 2)
+ set game mode
+ set how many of those are computers (default 0)
+ if computers > 0 show the ability to show difficulty (default easy of easy/normal/hard)
+ advanced settings which include; 
+ set minimum word length (default 3)

These will be the possibilities to monetize the app (this is just for feature possibilities):

* unlock more game modes (default is the normal variant of ghost, you will be abled to unlock all 
game modes without spending money but you can also just pay for them immediately.
* customize your ghost with clothes and attributes (some of which you can unlock without paying as well)
* banners (or pay a 1-time premium for all the contents of the app, including all of the above)

##See the mockup
[Here you will be able to see the mockup of the actual game](http://invis.io/AZ2QO3K7Y)

You can see my comments, and already use it like it's a real app by clicking on buttons. Even swiping works on a mobile device for the  
full experience. You can even display it as if it was an actual app by opening it in chrome, go to menu, and then click  
"Add to homescreen". This will add an icon to one of your home-screens which you can click, the app will then open in full screen  
 as if it was a native app.

###Visual design decisions

##Frameworks, libraries and other technologies

###Frameworks used

####Controllers
none of right now

####Classes overview
none of right now

###Libraries used (APIs)
none of right now

###Other technologies used

###Code design decisions

These technologies will be or are used in the implementation of the game Ghost

* Connect to other players via bluetooth\wireless
+ Add high-scores and maybe other statistics, will probably be done with a framework provided by Google
+ Chat with other players. (requires a database of some sort and will be skipped for this course unless time dictates otherwise)


