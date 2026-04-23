class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        map={}
        
        # think about hashmap structure what goes at key and value pair 
        # we group words into there sub grousp based off them having the same character frequency

        # all word that are anagarms share the same signature
        # compute signature for each word
        # use that signature as a hashmap key

        # key is the what you want to look up fast
        # value is what you want to get when you find the key 


        # we put string signature meaning its letter frequncey as key in dict and assign value as the word
       
        for word in strs:
            count =[0] * 26  # each word must have its own independent frequnecy signature  for eahc word so we do let it rest for each word
            for char in word:
                count[ord(char) -ord('a')] +=1  # create character frequncey for each word  
            if tuple(count) not in map:  # they key for the hashmap must be immutable that is why we type cast character frequncey of each word
            # to be be a tuple because keys in dict are hashed and in order for a key to be a key in a dict it must be hashed and can only be hashed
            # if it never changed 
                map[tuple(count)] = [word] # first insertion must be list not string  ( this again look over it why [] why not just word) #ASK
            elif tuple(count) in map:
                map[tuple(count)].append(word)
        return list(map.values())
            # map[key] = word # is assinging value to key 
            # prev_key = key is setting what ever metric key is in this case is frequencey of characters in word so its 0,1,1,1,,0,0, like that 

        