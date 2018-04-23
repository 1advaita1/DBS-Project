gcb > "C:/DBSproj/songinfo/filepath.txt"
#bash -c "mp3info -p %F $path" > C:/DBSproj/songinfo/Artists.txt
cd "C:/Users/advaita/Downloads"
$path="ismo.mp3"
cd "C:/Users/advaita/Downloads"
bash -c "mp3info -p %a $path" > C:/DBSproj/songinfo/Artists.txt
bash -c "mp3info -p %y $path" > C:/DBSproj/songinfo/Year.txt
bash -c "mp3info -p %l $path" > C:/DBSproj/songinfo/Album.txt
bash -c "mp3info -p %g $path" > C:/DBSproj/songinfo/Genre.txt

