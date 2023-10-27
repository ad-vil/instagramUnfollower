Hello!

    This program is intended to find the people who don't follow you back on instagram without using
any unsafe third party apps which are likely to steal your data. This program is completely safe since it
never even uses your login info, only info you request directly in the app.
(this may look super confusing, but it's simple and only takes around 10 min so just follow along carefully :) )


- request data about followers and following from account center, then input them into notepad or a .txt file
(In case you don't know how to do this, here's how):

On the PC, log into you IG account on instagram.com.
Go to Settings, "Privacy and Security" and in the section "Data Download" click on "Request Download".
Enter your email, choose HTML and confirm with your password.
Check your email. (It can take a while (even a day or two) till the files are generated and the link send to your mail).
Follow the instructions to download the zip file(s).
Unpack them and look for a folder called "followers_and_following" and open the files "followers.html" and "following.html" in your browser.

(this can also be done on the mobile app through the account center)


- start with dateRemover.java

- make sure you've copied all the info from the html files into 2 notepad files at this point.

- be sure to remove any other text that may come if you decide to ctrl+a
the document (stuff like logo text or random html text)

- this program just removes the dates and creates new text files for them, then input into the comparing program


format should be:

username
date + time
username
date + time

(and so on...)


- after making sure the file is in the correct format and properly named,
      followers should be followers.txt
      following should be following.txt
- drag and drop the both directly into the program file and run!

- then go to the compare.java file and run that too

- the list of people who don't follow back will be saved in a program called: followingButNotFollowers.txt
- then you can go into instagram and unfollow each one :)

Thanks for checking out the program!