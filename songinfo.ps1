gcb > "C:/DBSproj/songinfo/filepath.txt"

$filepat = Get-Content "C:\DBSproj\songinfo\filepath.txt"
$pathh=Get-ChildItem "$filepat" 
$pathh.Name > C:\DBSproj\songinfo\Filename.txt
$filename=Get-Content "C:/DBSproj/songinfo/Filename.txt"

bash -c "mp3info -p %F $filename" > C:/DBSproj/songinfo/Artists.txt
bash -c "mp3info -p %a $filename" > C:/DBSproj/songinfo/Artists.txt
bash -c "mp3info -p %y $filename" > C:/DBSproj/songinfo/Year.txt
bash -c "mp3info -p %l $filename" > C:/DBSproj/songinfo/Album.txt
bash -c "mp3info -p %g $filename" C:/DBSproj/songinfo/Genre.txt

start Album_year_concat.bat



