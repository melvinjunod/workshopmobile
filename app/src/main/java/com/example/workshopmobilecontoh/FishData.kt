package com.example.workshopmobilecontoh

object FishData {
    private val fishName = arrayOf(
        "African Lungfish",
        "Baikal Oilfish",
        "Atlantic Cod",
        "Asian Arowana",
        "Spiny Dogfish",
        "Electric Catfish",
        "Flagfish",
        "Goldfish",
        "Hammerhead Shark",
        "Red Lionfish",
        "Muskellunge",
        "Orbicular Batfish",
        "Paradise Fish",
        "Titan Triggerfish",
        "Yellowfin Surgeonfish"
    )

    private val fishFamily = arrayOf(
        "Lepidosirenidae",
        "Comephoridae",
        "Gadidae",
        "Osteoglossidae",
        "Squalidae",
        "Malapteruridae",
        "Cyprinodontidae",
        "Cyprinidae",
        "Sphyrnidae",
        "Scorpaenidae",
        "Esocidae",
        "Ephippidae",
        "Osphronemidae",
        "Balistidae",
        "Acanthuridae"
    )

    private val fishOrder = arrayOf(
        "Dipnoi",
        "Scorpaeniformes",
        "Gadiformes",
        "Osteoglossiformes",
        "Squaliformes",
        "Siluriformes",
        "Cyprinodontiformes",
        "Cypriniformes",
        "Carcharhiniformes",
        "Scorpaeniformes",
        "Esociformes",
        "Acanthuriformes",
        "Anabantiformes",
        "Tetraodontiformes",
        "Acanthuriformes"
    )

    private val fishDetail = arrayOf(
        "African lungfishes are elongated, eel-like fishes, with thread-like pectoral and pelvic fins. They have soft scales, and the dorsal and tail fins are fused into a single structure. They can either swim like eels, or crawl along the bottom, using their pectoral and pelvic fins. The largest species reach about 200cm (6.6ft) long. African lungfishes generally inhabit shallow waters, such as swamps and marshes. They are also found in larger lakes such as Lake Victoria. They can live out of water for many months in burrows of hardened mud beneath a dried stream bed. They are carnivorous, eating crustaceans, aquatic insect larvae, and molluscs.",
        "Comephorus have translucent bodies with no scales, but appear dull when dead. The big Baikal oilfish (C. baikalensis) can reach up to 21cm (8.3in) in length and the little Baikal oilfish (C. dybowskii) up to 16cm (6.3in). Males are smaller than females, only reaching about 2⁄3 the length. They have long pectoral fins, and although pelvic bones are present, they lack pelvic fins. They have a strong lateral line. The lateral line system on the head consists of large cavities linked by narrow, bony bridges with small external pores. High lipid content and porous bones result in an almost neutral buoyancy and lack of swim bladder allows the fish to tolerate varying pressure extremes as they move through the water column.",
        "The Atlantic cod (Gadus morhua) is a benthopelagic fish of the family Gadidae, widely consumed by humans. It is also commercially known as cod or codling. Dry cod may be prepared as unsalted stockfish, and as cured salt cod or clipfish. \nIn the western Atlantic Ocean, cod has a distribution north of Cape Hatteras, North Carolina, and around both coasts of Greenland and the Labrador Sea; in the eastern Atlantic, it is found from the Bay of Biscay north to the Arctic Ocean, including the Baltic Sea, the North Sea, Sea of the Hebrides, areas around Iceland and the Barents Sea. ",
        "The Asian arowana (Scleropages formosus) comprises several phenotypic varieties of freshwater fish distributed geographically across Southeast Asia. While most consider the different varieties to belong to a single species, work by Pouyaud et al. (2003) differentiates these varieties into multiple species. They have several other common names, including Asian bonytongue, dragonfish, and a number of names specific to the different color varieties. Native to Southeast Asia, Asian arowanas inhabit blackwater rivers, slow-moving waters flowing through forested swamps and wetlands. Adults feed on other fish, while juveniles feed on insects.",
        "The spiny dogfish (Squalus acanthias), spurdog, mud shark, or piked dogfish is one of the best known species of the Squalidae (dogfish) family of sharks, which is part of the Squaliformes order. While these common names may apply to several species, Squalus acanthias is distinguished by two spines (one anterior to each dorsal fin) and no anal fin. It lives in shallow waters and further offshore in most parts of the world, especially in temperate waters. Those in the northern Pacific Ocean were reevaluated in 2010 and found to constitute a separate species, now called the Pacific spiny dogfish (Squalus suckleyi).",
        "Electric catfish or Malapteruridae is a family of catfishes (order Siluriformes). This family includes two genera, Malapterurus and Paradoxoglanis, with 21 species. Several species of this family have the ability to generate electricity, delivering a shock of up to 350 volts from its electric organ. Electric catfish are found in tropical Africa and the Nile River. Electric catfish are usually nocturnal and carnivorous. Some species feed primarily on other fish, incapacitating their prey with electric discharges, but others are generalist bottom foragers, feeding on things like invertebrates, fish eggs, and detritus. The largest can grow to about 1.2 meters (3 ft) long, but most species are far smaller.",
        "The flagfish (Jordanella floridae), also known as the American flagfish or Florida flagfish, is a pupfish, a type of killifish, from the family Cyprinodontidae which is endemic to Florida. It is found in the aquarium trade. Its common name derives from the dominant males' body pattern, which bears some resemblance to the Flag of the United States. ",
        "The goldfish (Carassius auratus) is a freshwater fish in the family Cyprinidae of order Cypriniformes. It is commonly kept as a pet in indoor aquariums, and is one of the most popular aquarium fish. Goldfish released into the wild have become an invasive pest in parts of North America. Native to East Asia, the goldfish is a relatively small member of the carp family (which also includes the Prussian carp and the crucian carp). It was first selectively bred for color in imperial China more than 1,000 years ago, and several distinct breeds have since been developed. Goldfish breeds vary greatly in size, body shape, fin configuration, and coloration (various combinations of white, yellow, orange, red, brown, and black are known). ",
        "The hammerhead sharks are a group of sharks that form the family Sphyrnidae, so named for the unusual and distinctive structure of their heads, which are flattened and laterally extended into a \"hammer\" shape called a cephalofoil. Most hammerhead species are placed in the genus Sphyrna, while the winghead shark is placed in its own genus, Eusphyra. Many different, but not necessarily mutually exclusive, functions have been postulated for the cephalofoil, including sensory reception, manoeuvering, and prey manipulation. The cephalofoil gives the shark superior binocular vision and depth perception.",
        "The red lionfish (Pterois volitans) is a venomous coral reef fish in the family Scorpaenidae, order Scorpaeniformes. It is mainly native to the Indo-Pacific region, but has become an invasive species in the Caribbean Sea, as well as along the East Coast of the United States and East Mediterranean and also found in Brazil at Fernando de Noronha.",
        "Muskellunge closely resemble other esocids such as the northern pike and American pickerel in both appearance and behavior. Like the northern pike and other aggressive pikes, the body plan is typical of ambush predators with an elongated body, flat head, and dorsal, pelvic, and anal fins set far back on the body. Muskellunge are typically 28–48in (71–122cm) long and weigh 15–36lb (6.8–16.3kg), though some have reached up to 6ft (1.8m) and almost 70lb (32kg). Martin Arthur Williamson caught a muskellunge with a weight of 61.25lb (27.8kg) in November 2000 on Georgian Bay. The fish are a light silver, brown, or green, with dark vertical stripes on the flank, which may tend to break up into spots.",
        "The orbicular batfish (Platax orbicularis), also known as the circular batfish, orbiculate batfish, round batfish, or orbic batfish is a popular aquarium fish which occurs naturally in the tropical waters of the Indian and Pacific Oceans. These fishes are sought after for their high prize by nearby pacific communities as they are known for their high-quality meat. ",
        "The paradise fish, paradise-fish, paradisefish, or paradise gourami (Macropodus opercularis) is a species of gourami found in most types of fresh water in East Asia, ranging from the Korean Peninsula to northern Vietnam. This species can reach a standard length of 6.7cm, though most are only about 5.5cm. Paradise gouramis were one of the first ornamental fish available to western aquarium keepers, having been imported 1869 to France by the French aquarium fish importer Pierre Carbonnier in Paris. The paradise fish is one of the more aggressive members of its family. It is more aggressive than the three spot gourami, yet less pugnacious in nature than the less commonly kept combtail. ",
        "The titan triggerfish, giant triggerfish or moustache triggerfish (Balistoides viridescens) is a large species of triggerfish found in lagoons and at reefs to depths of 50m (160ft) in most of the Indo-Pacific, though it is absent from Hawaii. With a length of up to 75 centimetres (30in), it is the largest species of triggerfish in its range (the stone triggerfish, Pseudobalistes naufragium, from the east Pacific is larger). The titan triggerfish is diurnal and solitary. It feeds on sea urchins, molluscs, crustaceans, tube worms and coral. It often feeds by turning over rocks, stirring up sand and biting off pieces of branching coral. This is why other smaller fish species are often seen around it, as they feed on the detritus and smaller organisms that are stirred up. Titan triggerfish have been observed being aggressive to other fish who enter their territory. ",
        "The yellowfin surgeonfish or Cuvier's surgeonfish (Acanthurus xanthopterus) is one of several marine fish that change color as they get older. This characteristic confused fish identification, and originally put the young and adults in different species. With the arrival of aquaria and later, coral reef aquaculture, specialists noticed the color transformation. Only recently have zoologists begun to understand their metamorphosis. The yellowfin surgeonfish ranges in length to 70cm (28in). It has eight or 9 dorsal spines, 25-27 dorsal soft rays, three anal spines, 23-25 anal soft rays, and 16-24 anterior and 17-22 posterior gill rakers."
    )
    private val fishImage = intArrayOf(
        R.drawable.africanlungfish,
        R.drawable.baikaloilfish,
        R.drawable.cod,
        R.drawable.arowana,
        R.drawable.dogfish,
        R.drawable.electriceel,
        R.drawable.flagfish,
        R.drawable.goldfish,
        R.drawable.hammerhead,
        R.drawable.lionfish,
        R.drawable.muskellunge,
        R.drawable.orbicular,
        R.drawable.paradise,
        R.drawable.titantriggerfish,
        R.drawable.yellowfin
    )

    val listData : ArrayList<Fish>
        get() {
            val list = arrayListOf<Fish>()
            for (position in fishName.indices){
                val musicians = Fish()
                musicians.name = fishName[position]
                musicians.family = fishFamily[position]
                musicians.order = fishOrder[position]
                musicians.detail = fishDetail[position]
                musicians.photo = fishImage[position]
                list.add(musicians)
            }
            return list
        }
}