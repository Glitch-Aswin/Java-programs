# Navigate to the project directory
Set-Location -Path "D:\Dev\java2"

# Stage all changes (including untracked files)
git add .

# Commit changes with a message
$commitMessage = "Automated commit for adding new/updated files"
git commit -m $commitMessage

# Push changes to the main branch
git push -u origin main
