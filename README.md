# algorithmic-exercises

RomanToInteger
task link: https://leetcode.com/problems/roman-to-integer/
Constraints:
    - roman number length from 1 to 15
    - arabic numer min/max [1, 3999]

Roman numerals are usually written largest to smallest from left to right:
    I -> 1
    V -> 5
    X -> 10
    L -> 50
    C -> 100
    D -> 500
    M -> 1000
exceptions:
    IV = 4 (5 - 1)
    IX = 9 (10 -1)
    XL = 40 (50 - 10)
    XC = 90 (100 - 10)
    CD = 400 (500 - 100)
    CM = 900 (1000 - 100)

algorithm description:
    while (cursor <= str.length) {
        if(2nd = 1st) { 
            (sum + (2nd + 1st)), 
            cursor +2
        }
	    if(2nd > 1st) { 
            (sum + (2nd - 1st)), 
            cursor +2
        }
	    if(2nd < 1st) { 
            (sum + 1st), 
            cursor +1
        }
    }