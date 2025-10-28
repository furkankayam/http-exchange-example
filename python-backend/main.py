from fastapi import FastAPI
from pydantic import BaseModel

# FastAPI uygulamasını oluştur
app = FastAPI(title="Basit API", description="Name ve Surname dönen basit API")

# Response modeli
class Person(BaseModel):
    name: str
    surname: str

# Person bilgilerini dönen endpoint
@app.get("/persons", response_model=Person)
def get_person():
    return Person(name="Furkan", surname="Kaya")

# Çalıştırmak için:
# pip install fastapi uvicorn
# uvicorn main:app --reload