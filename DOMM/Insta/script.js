const reels = [
  {
    username: "travel_with_lia",
    likeCount: 15400,
    isLiked: false,
    commentCount: 320,
    caption: "Sunset vibes in Bali 🌅✨",
    video: "./reels/video1.mp4",
    userprofile: "https://example.com/profiles/lia.jpg",
    shareCount: 120,
    isFollowed: true
  },
  {
    username: "fit_jason",
    likeCount: 8920,
    isLiked: true,
    commentCount: 210,
    caption: "5-minute ab workout 🔥",
    video: "./reels/video2.mp4",
    userprofile: "https://example.com/profiles/jason.jpg",
    shareCount: 95,
    isFollowed: false
  },
  {
    username: "chef_monica",
    likeCount: 23000,
    isLiked: false,
    commentCount: 780,
    caption: "Creamy garlic pasta recipe 😍",
    video: "./reels/video3.mp4",
    userprofile: "https://example.com/profiles/monica.jpg",
    shareCount: 430,
    isFollowed: true
  },
  {
    username: "tech_tom",
    likeCount: 4100,
    isLiked: false,
    commentCount: 88,
    caption: "This gadget blew my mind! 🤯",
    video: "./reels/video4.mp4",
    userprofile: "https://example.com/profiles/tom.jpg",
    shareCount: 60,
    isFollowed: false
  },
  {
    username: "dance_with_amy",
    likeCount: 76000,
    isLiked: true,
    commentCount: 1500,
    caption: "Trying out this trending choreography 💃🔥",
    video: "./reels/video5.mp4",
    userprofile: "https://example.com/profiles/amy.jpg",
    shareCount: 980,
    isFollowed: true
  },
  {
    username: "urban_skater",
    likeCount: 5200,
    isLiked: false,
    commentCount: 210,
    caption: "Skating through the city 🛹🌆",
  video: "./reels/video1.mp4",
    userprofile: "https://example.com/profiles/skater.jpg",
    shareCount: 75,
    isFollowed: false
  },
  {
    username: "pet_paws",
    likeCount: 31000,
    isLiked: true,
    commentCount: 610,
    caption: "Cutest puppy ever 😭❤️",
  video: "./reels/video2.mp4",
    userprofile: "https://example.com/profiles/petpaws.jpg",
    shareCount: 450,
    isFollowed: true
  },
  {
    username: "fashion_by_nora",
    likeCount: 18700,
    isLiked: false,
    commentCount: 340,
    caption: "Outfit ideas for winter ❄️👗",
  video: "./reels/video3.mp4",
    userprofile: "https://example.com/profiles/nora.jpg",
    shareCount: 190,
    isFollowed: false
  },
  {
    username: "coding_sam",
    likeCount: 2500,
    isLiked: true,
    commentCount: 65,
    caption: "VSCode shortcuts you should know 💻✨",
  video: "./reels/video4.mp4",
    userprofile: "https://example.com/profiles/sam.jpg",
    shareCount: 33,
    isFollowed: true
  },
  {
    username: "nature_maria",
    likeCount: 45000,
    isLiked: false,
    commentCount: 980,
    caption: "Morning dew in the mountains 🌿⛰️",
  video: "./reels/video5.mp4",
    userprofile: "https://example.com/profiles/maria.jpg",
    shareCount: 520,
    isFollowed: false
  }
];

var sum = '';
reels.forEach(function(elem){
  sum = sum + `        <div class="all-reels">
            <div class="reel">
                 <video autoplay loop muted src="${elem.video}"></video>
                    alt="">
                <div class="bottom">
                    <div class="user">
                        <img src="${elem.userprofile}"
                            alt="">
                        <h4>${elem.username}</h4>
                        <button>Follow</button>

                    </div>
                    <h6>${elem.document}</h6>

                </div>
                <div class="right">
                    <div class="like">
                        <h4 id="like-icon"><i class="ri-heart-line"></i></h4>
                        <h6>Like</h6>
                    </div>
                    <div class="comment">
                        <h4 id="comment-icon"><i class="ri-chat-3-line"></i></h4>
                        <h6>69</h6>
                    </div>
                    <div class="save">
                        <h4 id="save-icon"><i class="ri-save-line"></i></h4>
                        <h6>Save</h6>
                    </div>
                    <div class="share">
                        <h4 id="share-icon"><i class="ri-share-forward-line"></i></h4>
                        <h6>Share</h6>
                    </div>
                </div>
            </div>
        </div>`
  
})

  let allreels = document.querySelector('.all-reels')

  allreels.innerHTML = sum;