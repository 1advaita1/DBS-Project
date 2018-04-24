gcb > "C:/DBSproj/songinfo/filepath.txt"
echo  obtained path
pause
$filepat = Get-Content "C:\DBSproj\songinfo\filepath.txt"
$pathh=Get-ChildItem "$filepat" 
$pathh.Name > C:\DBSproj\songinfo\Filename.txt
$filename=Get-Content "C:/DBSproj/songinfo/Filename.txt"
echo  obtained Name
pause
bash -c "pwd"

bash -c "mp3info -p %a $filename" > C:/DBSproj/songinfo/Artists.txt
Get-Content C:/DBSproj/songinfo/Artists.txt | Set-Content -Encoding utf8 Artists.txt
bash -c "mp3info -p %y $filename" > C:/DBSproj/songinfo/Year.txt
Get-Content C:/DBSproj/songinfo/Year.txt | Set-Content -Encoding utf8 Year.txt
bash -c "mp3info -p %l $filename" > C:/DBSproj/songinfo/Album.txt
Get-Content C:/DBSproj/songinfo/Album.txt | Set-Content -Encoding utf8 Album.txt
bash -c "mp3info -p %g $filename" C:/DBSproj/songinfo/Genre.txt
Get-Content C:/DBSproj/songinfo/Genre.txt | Set-Content -Encoding utf8 Genre.txt

echo  obtained metadata
pause
start C:/DBSproj/songinfo/Album_year_concat.bat
Get-Content C:/DBSproj/songinfo/Album_year_concat.txt | Set-Content -Encoding utf8 Album_year_concat.txt
pause


