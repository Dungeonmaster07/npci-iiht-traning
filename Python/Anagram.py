NO_OF_CHARS = 256
str1 = "Grab"
str2 = "Brag"

strr1 = str1.lower()
strr2 = str2.lower()

count1 = [0] * NO_OF_CHARS
count2 = [0] * NO_OF_CHARS


for i in strr1:
    count1[ord(i)] += 1

for i in strr2:
    count2[ord(i)] += 1

for i in range(NO_OF_CHARS):
    if count1[i] != count2[i]:
        print("Two strings are not Anagram")
print("Two strings are Anagram")
