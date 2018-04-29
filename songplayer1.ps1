$path=Get-Content "C:/DBSproj/songinfo/filepath.txt"
add-type -assembly presentationcore
$player = new-object system.windows.media.mediaplayer
$player.open("$path")
echo a
$player.play()

pause