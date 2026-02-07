# QA Automation Portfolio Project

## Overview
Ini adalah salah satu proyek automation akhir dari Bootcamp QA Dibimbing.  
Proyek ini dibuat menggunakan **Selenium** untuk Web Automation (CRUD Gist) dan **REST Assured** untuk API Automation (Reqres API).

## Why Selenium?
Kriteria tugas bootcamp meminta penggunaan Selenium.  
Selain itu, pengalaman menunjukkan CI/CD tidak bisa berjalan otomatis di GitHub jika menggunakan Katalon Free, sehingga Selenium dipilih agar pipeline bisa dijalankan dengan GitHub Actions.

## How to Run
1. Buat file `config.properties` di root project berisi:
github.username=xxxxx
github.password=xxxxx
REQRES_API_KEY=reqres_xxxxx

2. Jalankan suite dengan:
./gradlew test
atau langsung:
mvn test -DsuiteXmlFile=testng.xml

## Important Notes
- Automation di fitur GitHub (CRUD Gist) bisa diblokir oleh pihak GitHub jika terlalu sering dijalankan.  
**Disarankan untuk tidak menjalankan terlalu sering.**
- Credential (`config.properties`) sudah di-ignore dengan `.gitignore` agar tidak ikut ke repository publik.
- Untuk CI/CD, gunakan **GitHub Secrets** agar pipeline tetap bisa berjalan tanpa expose credential.
