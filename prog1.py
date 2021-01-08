import os
import re
import json
import requests
from requests.auth import HTTPBasicAuth
import sys


url='http://mydomain.com/posts/linked-apis-definition'

response = requests.get(url, auth=('root','root'))

print("Opening test file")

file = open('testfile.json','w')

file.write(response.text)

file.close()

"""
count =0
with open('testfile.json', 'r') as sources:
    lines = sources.readlines()
for i in range(0,5000):
        with open('testfile.json', 'w') as sources:
            for line in lines:
                assetT = str(sys.argv[1])
                sub  = str(sys.argv[2]) + str(i)
                sources.write(line.replace(assetT, sub))
        with open('testfile.json','r') as f:
            data = json.load(f);
            print("Posting to AiM")
            response =requests.post('http://localhost:8080/fmax/crud/dto/AeAAssetE',auth=('root','root') ,json = data)
            print ("stats: ok")
            count = count +1
            print("count ran:", count)
print ("Done")

"""
