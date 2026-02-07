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
Ketik "./gradlew test" pada terminal

3. Cara Kedua:
Ketik "mvn test" pada terminal 

4. Cara Ketiga:
Klik kanan file "testng.xml" lalu pilih Run

5. Cara Keempat:
Klik kanan salah satu file test case lalu pilih Run

## Screenshot Result in Selenium
<img width="369" height="513" alt="Screenshot 2026-02-07 214854" src="https://github.com/user-attachments/assets/33a91744-bb22-4393-8214-0ded11446546" />

<img width="439" height="357" alt="Screenshot 2026-02-07 214914" src="https://github.com/user-attachments/assets/3cddb940-d9ec-4fcd-977e-79f524ba6342" />

## Important Notes
- Automation di fitur GitHub (CRUD Gist) bisa diblokir oleh pihak GitHub jika terlalu sering dijalankan.  
**Disarankan untuk tidak menjalankan terlalu sering.**
- Credential (`config.properties`) sudah di-ignore dengan `.gitignore` agar tidak ikut ke repository publik.
- Credential pada GitHub disimpan dalam Repository Secrets.
- Untuk CI/CD, gunakan **GitHub Secrets** agar pipeline tetap bisa berjalan tanpa expose credential.
