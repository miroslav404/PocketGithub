package com.trollologic.pocketgithub.models.responses;

/**
 * Created by miroslav on 05.02.17..
 */

public class GithubUser {

    String login;
    long id;
    String avatar_url;
    String gravatar_id;
    String url;
    String html_url;
    String followers_url;
    String following_url;
    String gists_url;
    String starred_url;
    String subscriptions_url;
    String organizations_url;
    String repos_url;
    String events_url;
    String type;
    boolean site_admin;
    String name;
    String company;
    String blog;
    String location;
    String email;
    String hireable;
    String bio;
    int public_repos;
    int public_gists;
    int followers;

    public int getFollowing() {
        return following;
    }

    public void setFollowing(int following) {
        this.following = following;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public String getGravatar_id() {
        return gravatar_id;
    }

    public void setGravatar_id(String gravatar_id) {
        this.gravatar_id = gravatar_id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHtml_url() {
        return html_url;
    }

    public void setHtml_url(String html_url) {
        this.html_url = html_url;
    }

    public String getFollowers_url() {
        return followers_url;
    }

    public void setFollowers_url(String followers_url) {
        this.followers_url = followers_url;
    }

    public String getFollowing_url() {
        return following_url;
    }

    public void setFollowing_url(String following_url) {
        this.following_url = following_url;
    }

    public String getGists_url() {
        return gists_url;
    }

    public void setGists_url(String gists_url) {
        this.gists_url = gists_url;
    }

    public String getStarred_url() {
        return starred_url;
    }

    public void setStarred_url(String starred_url) {
        this.starred_url = starred_url;
    }

    public String getSubscriptions_url() {
        return subscriptions_url;
    }

    public void setSubscriptions_url(String subscriptions_url) {
        this.subscriptions_url = subscriptions_url;
    }

    public String getOrganizations_url() {
        return organizations_url;
    }

    public void setOrganizations_url(String organizations_url) {
        this.organizations_url = organizations_url;
    }

    public String getRepos_url() {
        return repos_url;
    }

    public void setRepos_url(String repos_url) {
        this.repos_url = repos_url;
    }

    public String getEvents_url() {
        return events_url;
    }

    public void setEvents_url(String events_url) {
        this.events_url = events_url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isSite_admin() {
        return site_admin;
    }

    public void setSite_admin(boolean site_admin) {
        this.site_admin = site_admin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getBlog() {
        return blog;
    }

    public void setBlog(String blog) {
        this.blog = blog;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHireable() {
        return hireable;
    }

    public void setHireable(String hireable) {
        this.hireable = hireable;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public int getPublic_repos() {
        return public_repos;
    }

    public void setPublic_repos(int public_repos) {
        this.public_repos = public_repos;
    }

    public int getPublic_gists() {
        return public_gists;
    }

    public void setPublic_gists(int public_gists) {
        this.public_gists = public_gists;
    }

    public int getFollowers() {
        return followers;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    int following;
    String created_at;
    String updated_at;


    /*
    {
  "login": "Trollologic",
  "id": 15922309,
  "avatar_url": "https://avatars.githubusercontent.com/u/15922309?v=3",
  "gravatar_id": "",
  "url": "https://api.github.com/users/Trollologic",
  "html_url": "https://github.com/Trollologic",
  "followers_url": "https://api.github.com/users/Trollologic/followers",
  "following_url": "https://api.github.com/users/Trollologic/following{/other_user}",
  "gists_url": "https://api.github.com/users/Trollologic/gists{/gist_id}",
  "starred_url": "https://api.github.com/users/Trollologic/starred{/owner}{/repo}",
  "subscriptions_url": "https://api.github.com/users/Trollologic/subscriptions",
  "organizations_url": "https://api.github.com/users/Trollologic/orgs",
  "repos_url": "https://api.github.com/users/Trollologic/repos",
  "events_url": "https://api.github.com/users/Trollologic/events{/privacy}",
  "received_events_url": "https://api.github.com/users/Trollologic/received_events",
  "type": "User",
  "site_admin": false,
  "name": "Miroslav Radanovic",
  "company": null,
  "blog": null,
  "location": null,
  "email": null,
  "hireable": null,
  "bio": null,
  "public_repos": 5,
  "public_gists": 0,
  "followers": 0,
  "following": 0,
  "created_at": "2015-11-19T08:45:38Z",
  "updated_at": "2017-02-01T20:05:46Z"
}
     */
}
