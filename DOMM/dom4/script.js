const user = [
  {
    "fullName": "Ava Thompson",
    "designation": "Senior Project Manager",
    "image": "https://images.unsplash.com/photo-1595152772835-219674b2a8a6",
    "tags": ["management", "leadership", "planning"]
  },
  {
    "fullName": "Liam Carter",
    "designation": "Software Engineer",
    "image": "https://images.unsplash.com/photo-1607746882042-944635dfe10e",
    "tags": ["javascript", "backend", "api"]
  },
  {
    "fullName": "Sophia Martinez",
    "designation": "UI/UX Designer",
    "image": "https://images.unsplash.com/photo-1544723795-3fb6469f5b39",
    "tags": ["design", "figma", "user-experience"]
  },
  {
    "fullName": "Ethan Wilson",
    "designation": "Data Analyst",
    "image": "https://images.unsplash.com/photo-1529626455594-4ff0802cfb7e",
    "tags": ["data", "sql", "visualization"]
  },
  {
    "fullName": "Maya Patel",
    "designation": "Marketing Specialist",
    "image": "https://images.unsplash.com/photo-1544005313-94ddf0286df2",
    "tags": ["marketing", "seo", "content"]
  }
];

var sum = '';

user.forEach(function(elem){
    sum += `
        <div class="card">
            <img src="${elem.image}" alt="">
            <h2>${elem.fullName}</h2>
            <h3>${elem.designation}</h3>
            <h4>${elem.tags.join(", ")}</h4>
        </div>
    `;
});

document.querySelector('main').innerHTML = sum;
