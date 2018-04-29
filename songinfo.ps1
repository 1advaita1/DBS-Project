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

bash -c "mp3info -p %r $filename" > C:/DBSproj/songinfo/Bitrate.txt

bash -c "mp3info -p %S $filename" > C:/DBSproj/songinfo/Filelength.txt



echo  obtained metadata

cd "C:/DBSproj"
pause
start C:/DBSproj/Album_year_concat.ps1
start C:/DBSproj/song_concat.ps1
start C:/DBSproj/add_genre_concat.ps1
start C:/DBSproj/add_artist_concat.ps1
pause
echo concatenated
pause


