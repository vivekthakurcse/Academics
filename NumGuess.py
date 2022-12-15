import random

maxn = 10
n = random.randint(1, maxn)
print('\n\n------------------------- Games of Numbers ------------------------\n')
print('                 Guess the number from 1 to %d' % maxn)
print('\n')
guess = None
while guess != n:
    guess = int(input('  Your turn   : '))
    if guess > n:
        print('\n    Too high >_< \n')
    if guess < n:
        print('\n    Too low  - __ - \n')

print('\n         Congratulations, you won!  ^⁠_⁠^ ')
print('\n-----------------------------------------------------------------\n')
