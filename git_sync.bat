@echo off
cd /d C:\Users\monda\IdeaProjects\Java_DSA

echo Checking Git status...
git status

echo Pulling latest changes from GitHub...
git pull origin main

echo Adding all changes...
git add -A

echo Committing changes...
git commit -m "Automated commit from desktop" || echo "No changes to commit"

echo Pushing changes to GitHub...
git push origin main

echo Sync completed! ✅
pause
