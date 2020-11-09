import requests
import pandas as pd
import hashlib
import math

url = "http://localhost:8080/data/"


class file:
    def __init__(self,link):
        self.json = {}
        self.fileLink = link
        if not(self.openFile()):
            return
        
        self.findQuartilesPercentages()

    
    def findQuartilesPercentages(self):
        for row in self.file.iterrows():
            if row[]

    # Will open file from file link
    def openFile(self):
        try:
            self.file = pd.read_csv(self.fileLink,sep=";")
            return True
        except Exception as error:
            print(error)
            return False
        
    # upload json to url
    def upload(self):
        pass


# countryCodes = requests.get("http://localhost:8080/countries")["code"]
countryCodes = ["AD"]
for result in result.json():
    current = file("../wid_all_data/WID_data_"+countryCodes+".csv")