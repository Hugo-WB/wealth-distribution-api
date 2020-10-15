import requests
import pandas as pd
import hashlib
import math

url = "http://localhost:8080/countries"

def isValidCountry(country):
    notNanData = country[["alpha2","titlename","shortname"]]
    if all((data == data) for data in notNanData):
        return True
    else:
        return False
    

def postCountry(i,country):
    if not(isValidCountry(country)):
        print(i," is not valid")
        return
    json = {}
    print(country["titlename"])
    # ID
    hash = hashlib.md5()
    hash.update( country["titlename"].encode("utf-8") )
    id = str(int(hash.hexdigest(),16))[0:8]
    json["id"] = id

    # CountryCode
    json["code"] = country["alpha2"]

    #name
    json["name"] = country["titlename"]

    #shortName 
    json["shortName"] = country["shortname"]
    
    #region1
    if (country["region"] == country["region"]):
        json["region"] = country["region"]
    else:
        json["region"] = "null"
    
    #region2
    if (country["region2"] == country["region2"]):
        json["region2"] = country["region2"]
    else:
        json["region2"] = "null"

    print(json)
    headers = {'Content-type': 'application/json'}
    response = requests.post(url, json=json,headers=headers)
    print("reponse:")
    print(response)

    




countries = pd.read_csv("../wid_all_data/WID_countries.csv",sep=";",encoding="utf-8")

print(countries)
print(countries.columns)
for index,country in countries.iterrows():
    postCountry(index,country)


