#Project: Ghost
##Summary: This project is based on the game Ghost.
The normal variant of the game requires two or more competing players. Each player has to pick a letter, clockwise, the  
first player to complete a word after 3 letters loses the round.  

You can play this game with 2 players or more. An extra feature of the game, and of which the game name originates, is
that when a player has lost 5 rounds, it becomes a ghost (a letter for each time the player loses a round, thus   
G-H-O-S-T). A ghost can talk to active players, if an active player talks back to the ghost the active player himself  
turns into a ghost. The last active player wins the game.

The game has mary variants. Which makes it possible to either insert a letter anywhere or for example mirror the word 
so that the beginning of the word becomes the end giving the game an extra dimension.

For more information about the rules of the game and how to game originated [ghost on wikipedia](http://en.wikipedia.org/wiki/Ghost_%28game%29)

##Specification
These games will be playable:
* Superghost
* Superduperghost
* Xghost
* Spook

These will be the possible settings

Game settings
* set number of players (default 2)
+ set computer/human (default computer)
+ set how many of those are computers (default 0)
+ if computers > 0 set difficulty of computer (easy/medium/hard) (default easy)
+ set game mode (ghost normal)

Advanced settings which include 
+ set minimum word length (default 3)

User settings
* Customize ghost color and look by wearables
* Change name   

Ways to monetize the app
* add-banners
* buy premium (no adds, unlocks all game-modes (first only ghost is available), unlocks wearables and hints about  
each game mode)

##See the mockup
[Here you will be able to see the mockup of the actual game](http://invis.io/D72QQNQ5M)

You can see my comments, and already use it like it's a real app by clicking on buttons as well as swiping between  
screens. You can even display it as if it was an actual app by opening it in chrome, go to menu, and then click   
"Add to homescreen". This will add an icon to one of your home-screens which you can click, the app will then open in  
full screen as if it was a native app.

###Visual design decisions
I gave all screens a name and in combination with multiple mockups I tried to think of the possible experience for the    
user. The upcoming section will sum up all the screens and why I decided to include these options or exclude others!  

**0.1 introduction screen - short explanation of the game**  
- (top bar) Healthy Ghosts (name of the game on top) 
- (picture) Picture of ghost.
- (text) Basic principles of the game.  
- (button) Next!  

This introduction screen is there so that each user does not feel lost in the game and all users start with some (basic)  
knowledge of the game. Since I don't expect the user to be familiar with the game I give a short introduction that   
informs the player where this game is about. Word skills. I put the picture of the ghost above the text to indicate that    
this is not going to be a boring (non-visual) game. This sets up some expectations which I will hopefully meet.

Here is the text:  

> HEALTHY GHOSTs
> 
> A game in which you play as a ghost and try to outsmart others with your word skills!  
>
> Each turn a player adds a letter to a growing chain of letters.  
> This chain of letters should not form an actual word,  
> but you should still be able to when more letters are added.  


**0.2 ghost creation - personalise the experience**

* (button) tap to change color (random color as default to prevent users from all having same color)
+ (text) change the name of ghost (random name as default in gray, easily change-able)
+ (button) Let's play

This second screen is to let the user create a further bond with the game. Nothing is as boring as a game that is static.
You can tap the ghost to change color, a random color is chosen by default from a list of colors so that  
not all users have the same color by default. And a random name is chosen from a list of ghost-names as a fun feature.  
With all the default values in place it's very easy to set the game up for people not wanting to do much customizing,
while still maintaining a certain level of uniqueness. This makes the feeling of the game quick and easy.

**1.0 games - home screen**

* large round icon of the ghost with the name under the ghost (max characters)  
+ (line is click-able) active games  
+ (button) new game screen (+) (show this +-button button besides the active games if there are already games)  

This is where the user sees his own ghost, his stats and his open games. You can see that the position of the button  
create game are the same as the 2 previous ones. This way the user feels in control, and does not have to seek for  
the most obvious controls. A user can click on active games or create a new one. Since this game probably requires long
thinking time and some creativity you can imagine that games are often not finished sequentially, rather parallel.  
This way the user can quickly see if it's their turn and what the actual word is without actually needing to enter the  
game. This is extremely handy and useful.

**1.1 (on top)**

* players  
- computers (on/off) (default is on)  
-- difficulty  
- advanced settings (little in grey, only notice-able for those who seek for it)  
-- minimum word length  

This is probably the screen that could use the biggest improvements. I don't know which multi-player options I will
create. Do you need a database and an own server for multi-player options for example. I hope to get answers on these  
questions later on so I can make it easier then right now. 

I am thinking about 3 icons, computer, same device but with more than 1 player, multi-player online. After clicking an 
icon you will get options belonging to this setting. With easy + and - buttons. Default is 1-player. You can add  
players/computers by tapping on the option, long press will result in lowering.  
But for now I will leave it like this.

**2. game screen**

* (top bar) active player on top bar with possible a fancy animation (username's turn, your turn)
- (pictures) this is also visible through the player icon, green background means it's his or their turn. All the players in the
game have their icon displayed.
- (boxes and text) The word is displayed below these icons
- (text) Last turn
- (button) it's a word, prove it. Game mechanics to let the user know it's a word or not or you don't believe that he  
knows it.  

I use the top bar in combination with transition animations to give the user the feeling of awareness of what is  
happening and where the user is. I think I can only really improve this when the app is in it's final stage. I created  
boxes around each letter to give the user the feeling that each letters was a different turn.

**3. settings menu**

* icon
- games
- rules
- achievements
- get premium!
- invite friends
- feedback

**4. user settings**

* change ghost color (only affected after game)
- add wearables to ghost
- change username

**5. rules**

* switch between game modes (by swiping) (show (unlock 69 cents) and grayed out game modes if not premium)
- show description and example of each game mode.
- (start game)

**6. achievements**

* show all possible unlock-able items, with description (different if unlocked) but with question mark if you
have not unlocked it. My idea to include question marks for not unlocked achievements is that it might attract interest  
of what the image would look like. You can still see the description to see how to unlock it, so the user does not feel  
like it is random/not in his control.

**7. get premium**

* a screen that comes down from above.

**8. invite friends**

* by e-mail/adresses from phone/google+

**9. feedback**

* information about what would be useful feedback. Ideas for improvements or complaints? We are happy to improve the app for you.
- create a form that sends an e-mail to ghost-android-app@gmail.com
- always use e-mail adress in order to get reply
- Thank you for you feedback! (after succesfully sending the feedback)

##Frameworks, libraries and other technologies

###Frameworks used
none of right now

####Controllers
none of right now

####Classes overview
none of right now

###Libraries used (APIs)
none of right now

###Other technologies used
* Connect to other players via bluetooth\wireless
+ Add high-scores and maybe other statistics, will probably be done with a framework provided by Google
+ Chat with other players. (requires a database of some sort and will be skipped for this course unless time dictates otherwise)


###Code design decisions



