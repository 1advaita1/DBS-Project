#Getting filepath and name
gcb > "C:/DBSproj/songinfo/filepath.txt"
echo  obtained path

$filepath = Get-Content "C:\DBSproj\songinfo\filepath.txt"

$lpath=Split-Path -Path "$filepath"
$filename=Split-Path -Leaf "$filepath"


echo  obtained Name
pause


#Getting metadata
cd "$lpath"
bash -c "pwd"
pause

bash -c "mp3info -p %t $filename" > C:/DBSproj/songinfo/Filename_true.txt

bash -c "mp3info -p %a $filename" > C:/DBSproj/songinfo/Artists.txt

bash -c "mp3info -p %y $filename" > C:/DBSproj/songinfo/Year.txt

bash -c "mp3info -p %l $filename" > C:/DBSproj/songinfo/Album.txt

bash -c "mp3info -p %g $filename" > C:/DBSproj/songinfo/Genre.txt


echo  obtained metadata

#Concatenating and encoding
cd "C:/DBSproj/songinfo"
pause
start C:/DBSproj/songinfo/Album_year_concat.bat
pause

start C:/DBSproj/songinfo/song_concat.bat

pause



pause


