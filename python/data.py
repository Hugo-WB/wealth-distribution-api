import requests
import pandas as pd
import hashlib
import math

url = "http://localhost:8080/data/"


class 
def uploadFile(fileLink):
    try:
        file = pd.read_csv(fileLink,sep=";")
        print(file)
    except Exception as error:
        print(error)
        return




result = requests.get("http://localhost:8080/countries")
for result in result.json():
    uploadFile("../wid_all_data/WID_data_"+result["code"]+".csv")