$play=C:/Users/advaita/Downloads/05_PENNYROYAL_TEA.mp3
add-type -assembly presentationcore
$player = new-object system.windows.media.mediaplayer
$player.open("$play")
$player.play()
pause


