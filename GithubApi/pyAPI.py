from github import Github

g = Github("Insert Token Here")

for repo in g.get_user().get_repos():
    print("-"*60)
    print(repo.name)
    print("Title of repository:", repo.full_name)
    print("Languages:", repo.language)
    print("Date created:", repo.created_at)
    print("Contents:")
    for content in repo.get_contents(""):
        print(content)
