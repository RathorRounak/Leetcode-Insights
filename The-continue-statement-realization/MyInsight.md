I was doing LeetCode question 20.

I wrote the whole logic but got stuck in one single point — time complexity.
My code was correct, but the time complexity was high, so I gave it to ChatGPT, and it gave me the same code with just one line different in it, and that is the "continue" statement.

On line 14 ChatGPT added the continue statement, and suddenly I beat 76% people according to LeetCode’s algorithm. Before this, it was just 20%.

I am sharing this because I learned something new today.
Even though I knew the use of continue, I never thought about using it like this in this particular logic.

If you wanna try this, just add continue on line 14 and remove the if statement from line 18.

Don't remove the code inside that if-statement — just remove the condition and the brackets.