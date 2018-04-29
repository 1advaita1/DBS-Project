Get-Content "C:/DBSproj/songinfo/Artists.txt" | Set-Content -Encoding utf8 "C:/DBSproj/songinfo/fArtists.txt"

Get-Content "C:/DBSproj/songinfo/Year.txt" | Set-Content -Encoding utf8 "C:/DBSproj/songinfo/fYear.txt"

Get-Content "C:/DBSproj/songinfo/Album.txt" | Set-Content -Encoding utf8 "C:/DBSproj/songinfo/fAlbum.txt"

Get-Content "C:/DBSproj/songinfo/Genre.txt" | Set-Content -Encoding utf8 "C:/DBSproj/songinfo/fGenre.txt"

Get-Content "C:/DBSproj/songinfo/Bitrate.txt" | Set-Content -Encoding utf8 "C:/DBSproj/songinfo/fBitrate.txt"

Get-Content "C:/DBSproj/songinfo/Filelength.txt" | Set-Content -Encoding utf8 "C:/DBSproj/songinfo/fFilelength.txt"

Get-Content "C:/DBSproj/songinfo/Filename_true.txt" | Set-Content -Encoding utf8 "C:/DBSproj/songinfo/fFilename_true.txt"

Get-Content "C:/DBSproj/songinfo/Views.txt" | Set-Content -Encoding utf8 "C:/DBSproj/songinfo/fViews.txt"


Get-Content "C:/DBSproj/songinfo/Album_year_concat.txt" | Set-Content -Encoding utf8 "C:/DBSproj/songinfo/fAlbum_year_concat.txt"


Get-Content "C:/DBSproj/songinfo/song_concat.txt" | Set-Content -Encoding utf8 "C:/DBSproj/songinfo/fsong_concat.txt"

Get-Content "C:/DBSproj/songinfo/add_genre_concat.txt" | Set-Content -Encoding utf8 "C:/DBSproj/songinfo/fadd_genre_concat.txt"

Get-Content "C:/DBSproj/songinfo/add_artist_concat.txt" | Set-Content -Encoding utf8 "C:/DBSproj/songinfo/fadd_artist_concat.txt"

pause

echo Encoded.
