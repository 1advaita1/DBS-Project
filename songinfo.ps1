$path="hbd.mp3"
cd "C:/Users/advaita/Downloads"
bash -c "mp3info -p %a $path" > C:/DBSproj/songinfo/Artists.txt
bash -c "mp3info -p %y hbd.mp3" > C:/DBSproj/songinfo/year.txt
bash -c "mp3info -p %a hbd.mp3" > C:/DBSproj/songinfo/artist.txt
pause