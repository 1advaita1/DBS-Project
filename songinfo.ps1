#Getting filepath and name
gcb > "C:/DBSproj/songinfo/filepath.txt"
echo  obtained path
$myPath = Get-Content "C:/DBSproj/songinfo/filepath.txt"
$myPath = $myPath -replace "\\", "/"
$mypath > "C:/DBSproj/songinfo/songp.txt"


$filepath = Get-Content "C:\DBSproj\songinfo\filepath.txt"

$lpath=Split-Path -Path "$filepath"
$filename=Split-Path -Leaf "$filepath"


echo  obtained Name

#Getting metadata
cd "$lpath"
bash -c "pwd"


bash -c "mp3info -p %t $filename" > C:/DBSproj/songinfo/Filename_true.txt

bash -c "mp3info -p %a $filename" > C:/DBSproj/songinfo/Artists.txt

bash -c "mp3info -p %y $filename" > C:/DBSproj/songinfo/Year.txt

bash -c "mp3info -p %l $filename" > C:/DBSproj/songinfo/Album.txt

bash -c "mp3info -p %g $filename" > C:/DBSproj/songinfo/Genre.txt

bash -c "mp3info -p %r $filename" > C:/DBSproj/songinfo/Bitrate.txt

bash -c "mp3info -p %S $filename" > C:/DBSproj/songinfo/Filelength.txt

$bcd=Get-Content "C:/DBSproj/songinfo/Filename_true.txt"
$bcd
echo  obtained metadata

Get-Content "C:/DBSproj/songinfo/Artists.txt" | Set-Content -Encoding utf8 "C:/DBSproj/songinfo/fArtists.txt"

Get-Content "C:/DBSproj/songinfo/Year.txt" | Set-Content -Encoding utf8 "C:/DBSproj/songinfo/fYear.txt"

Get-Content "C:/DBSproj/songinfo/Album.txt" | Set-Content -Encoding utf8 "C:/DBSproj/songinfo/fAlbum.txt"

Get-Content "C:/DBSproj/songinfo/Genre.txt" | Set-Content -Encoding utf8 "C:/DBSproj/songinfo/fGenre.txt"

Get-Content "C:/DBSproj/songinfo/Bitrate.txt" | Set-Content -Encoding utf8 "C:/DBSproj/songinfo/fBitrate.txt"

Get-Content "C:/DBSproj/songinfo/Filelength.txt" | Set-Content -Encoding utf8 "C:/DBSproj/songinfo/fFilelength.txt"

Get-Content "C:/DBSproj/songinfo/Filename_true.txt" | Set-Content -Encoding utf8 "C:/DBSproj/songinfo/fFilename_true.txt"

Get-Content "C:/DBSproj/songinfo/Views.txt" | Set-Content -Encoding utf8 "C:/DBSproj/songinfo/fViews.txt"

Get-Content "C:/DBSproj/songinfo/songp.txt" | Set-Content -Encoding utf8 "C:/DBSproj/songinfo/fsongp.txt"



cd "C:/DBSproj/songinfo"
bash -c "pwd"

bash -c "cat fAlbum.txt fYear.txt > Album_year_concat.txt"
echo milgaya album


bash -c "cat fFilename_true.txt fAlbum.txt fViews.txt fBitrate.txt fFilelength.txt fsongp.txt>song_concat.txt"
echo milgaya song!



bash -c "cat fFilename_true.txt fAlbum.txt fArtists.txt > add_artist_concat.txt"
echo milgaya artist


bash -c "cat fFilename_true.txt fAlbum.txt fGenre.txt > add_genre_concat.txt "
echo milgaya genre!


echo concatenated


Get-Content "C:/DBSproj/songinfo/Album_year_concat.txt" | Set-Content -Encoding utf8 "C:/DBSproj/songinfo/fAlbum_year_concat.txt"

Get-Content "C:/DBSproj/songinfo/song_concat.txt" | Set-Content -Encoding utf8 "C:/DBSproj/songinfo/fsong_concat.txt"

Get-Content "C:/DBSproj/songinfo/add_genre_concat.txt" | Set-Content -Encoding utf8 "C:/DBSproj/songinfo/fadd_genre_concat.txt"

Get-Content "C:/DBSproj/songinfo/add_artist_concat.txt" | Set-Content -Encoding utf8 "C:/DBSproj/songinfo/fadd_artist_concat.txt"



echo Encoded.




