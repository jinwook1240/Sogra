@echo off
git status
git add --all
git commit -m "%date% %time%"
git push origin master
