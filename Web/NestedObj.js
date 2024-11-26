var user = {
    name: "Usman Khan",
    id: 101,
    isPlaced: true,
    address: {
        city: "Pune",
        state: "MH",
        pincode: 452003,
        area: {
            area1: "FC Road", //  user.address.area.area1
            area2: "Hin",
            area3: {
                sector1: "sector-1-Rajugunj",
                sector2: "sector-2-Rajugunj",
            },
        },
    },
};

console.log(user.address.city);