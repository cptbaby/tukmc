package maxpowa.tukmc.util;

public class TukMCReference {

	public static int BOX_INNER_COLOR = 0x1A1A1A;
	public static int BOX_OUTLINE_COLOR = 0x969AA5;
	public static int BOX_HIGHLIGHT_COLOR = 0x4C4C4C;
	public static int BOX_EFFECT_OUTLINE_COLOR = 0x8d60a6;
	
	public static int RED_INNER = 0;
	public static int GREEN_INNER = 0;
	public static int BLUE_INNER = 0;
	
	public static int RED_OUTER = 0;
	public static int GREEN_OUTER = 0;
	public static int BLUE_OUTER = 0;
	
	public static final char FORMATTING_CODE_CHAR = '\u00a7';
	
	public static String otherEmotes = "\u2600\u2602\u2603\u2604\u2605\u2606\u2607\u2608\u2609\u260A\u260B\u260C\u260E\u2611\u2612\u2613\u2614\u2615\u2616\u2617\u2618\u2619\u261A\u261B\u261C\u261E\u261F\u2620\u2621\u2622\u2623\u2624\u2625\u2626\u2627\u2628\u2629\u262A\u262B\u262C\u262D\u262E\u262F\u2630\u2631\u2632\u2633\u2634\u2635\u2636\u2637\u2638\u2639\u263A\u263B\u263C\u263D\u263E\u263F\u2640\u2642\u2643\u2644\u2645\u2646\u2647\u2648\u2649\u264A\u264B\u264C\u264E\u2651\u2652\u2653\u2654\u2655\u2656\u2657\u2658\u2659\u265A\u265B\u265C\u265E\u265F\u2660\u2661\u2662\u2663\u2664\u2665\u2666\u2667\u2668\u2669\u266A\u266B\u266C\u266D\u266E\u266F\u2670\u2671\u2672\u2673\u2674\u2675\u2676\u2677\u2678\u2679\u267A\u267B\u267C\u267D\u267E\u267F\u2680\u2682\u2683\u2702\u2703\u2704\u2705\u2706\u2707\u2708\u2709\u270A\u270B\u270C\u270E\u2711\u2712\u2713\u2714\u2715\u2716\u2717\u2718\u2719\u271A\u271B\u271C\u271E\u271F\u2720\u2721\u2722\u2723\u2724\u2725\u2726\u2727\u2728\u2729\u272A\u272B\u272C\u272D\u272E\u272F\u2730\u2731\u2732\u2733\u2734\u2735\u2736\u2737\u2738\u2739\u273A\u273B\u273C\u273D\u273E\u273F\u2780\u2782\u2783\u2784\u2785\u2786\u2787\u2788\u2789\u278A\u278B\u278C\u278E\u2791\u2792\u2793\u2794\u2795\u2796\u2797\u2798\u2799\u279A\u279B\u279C\u279E\u279F\u27A0\u27A1\u27A2\u27A3\u27A4\u27A5\u27A6\u27A7\u27A8\u27A9\u27AA\u27AB\u27AC\u27AD\u27AE\u27AF\u27B0\u27B1\u27B2\u27B3\u27B4\u27B5\u27B6\u27B7\u27B8\u27B9\u27BA\u27BB\u27BC\u27BD\u27BE\u27BF\u2153\u2154\u2155\u2156\u2157\u2158\u2159\u215A\u215B\u215C\u215E\u215F\u2180\u2182\u2183\u2184\u2185\u2186\u2187\u2188\u2189\u2500\u2502\u2503\u2504\u2505\u2506\u2507\u2508\u2509\u250A\u250B\u250C\u250E\u2511\u2512\u2513\u2514\u2515\u2516\u2517\u2518\u2519\u251A\u251B\u251C\u251E\u251F\u2520\u2521\u2522\u2523\u2524\u2525\u2526\u2527\u2528\u2529\u252A\u252B\u252C\u252D\u252E\u252F\u2530\u2531\u2532\u2533\u2534\u2535\u2536\u2537\u2538\u2539\u253A\u253B\u253C\u253D\u253E\u253F\u2540\u2542\u2543\u2544\u2545\u2546\u2547\u2548\u2549\u254A\u254B\u254C\u254E\u2551\u2552\u2553\u2554\u2555\u2556\u2557\u2558\u2559\u255A\u255B\u255C\u255E\u255F\u2560\u2561\u2562\u2563\u2564\u2565\u2566\u2567\u2568\u2569\u256A\u256B\u256C\u256D\u256E\u256F\u2570\u2571\u2572\u2573\u2574\u2575\u2576\u2577\u2578\u2579\u257A\u257B\u257C\u257D\u257E\u257F\u2580\u2582\u2583\u2584\u2585\u2586\u2587\u2588\u2589\u258A\u258B\u258C\u258E\u2591\u2592\u2593\u2594\u2595\u2596\u2597\u2598\u2599\u259A\u259B\u259C\u259E\u259Fi\u2080\u2082\u2083\u2084\u2085\u2086\u2087\u2088\u2089\u208A\u208B\u208C\u208E\u2091\u2092\u2093\u2094\u2095\u2096\u2097\u2098\u2099\u209A\u209B\u209C\u2191\u2192\u2193\u2194\u2195\u2196\u2197\u2198\u2199\u219A\u219B\u219C\u219E\u219F\u21A0\u21A1\u21A2\u21A3\u21A4\u21A5\u21A6\u21A7\u21A8\u21A9\u21AA\u21AB\u21AC\u21AD\u21AE\u21AF\u21B0\u21B1\u21B2\u21B3\u21B4\u21B5\u21B6\u21B7\u21B8\u21B9\u21BA\u21BB\u21BC\u21BD\u21BE\u21BF\u21C0\u21C2\u21C3\u21C4\u21C5\u21C6\u21C7\u21C8\u21C9\u21CA\u21CB\u21CC\u21CE\u21D1\u21D2\u21D3\u21D4\u21D5\u21D6\u21D7\u21D8\u21D9\u21DA\u21DB\u21DC\u21DE\u21DF\u21E0\u21E1\u21E2\u21E3\u21E4\u21E5\u21E6\u21E7\u21E8\u21E9\u21EA\u21EB\u21EC\u21ED\u21EE\u21EF\u21F0\u21F1\u21F2\u21F3\u21F4\u21F5\u21F6\u21F7\u21F8\u21F9\u21FA\u21FB\u21FC\u21FD\u21FE\u21FF\u2300\u2302\u2304\u2305\u2306\u2307\u2308\u2309\u230A\u230B\u230C\u230E\u2311\u2312\u2313\u2314\u2315\uF0B1\u2317\u2318\u2319\u231A\u231B\u231C\u231E\u231F\u2320\u2321\u2325\uF0D6\u2328\u2329\u232A\uF0D5\u232C\u232D\u232E\u232F\u2330\u2331\u2332\u2333\u2334\u2335\u2336\u2337\u2338\u2339\u233A\u233B\u233C\u233D\u233E\u233F\u2380\u2382\u2383\u2384\u2385\u2386\u2387\u2388\u2389\u238A\u238C\u238E\u2391\u2392\u2393\u2394\u2395\u2396\u2397\u2398\u2399\u239A\u239B\u239C\u239E\u239F\u23A0\u23A1\u23A2\u23A3\u23A4\u23A5\u23A6\u23A7\u23A8\u23A9\u23AA\u23AB\u23AC\u23AD\u23AE\u23AF\u23B0\u23B1\u23B2\u23B3\u23B4\u23B5\u23B6\u23B7\u23B8\u23B9\u23BA\u23BB\u23BC\u23BD\u23BE\u23BF\u27F0\u27F1\u27F2\u27F3\u27F4\u27F5\u27F6\u27F7\u27F8\u27F9\u27FA\u27FB\u27FC\u27FD\u27FE\u27FF\u2900\u2902\u2903\u2904\u2905\u2906\u2907\u2908\u2909\u290A\u290B\u290C\u290E\u2911\u2912\u2913\u2914\u2915\u2916\u2917\u2918\u2919\u291A\u291B\u291C\u291E\u291F\u2920\u2921\u2922\u2923\u2924\u2925\u2926\u2927\u2928\u2929\u292A\u292B\u292C\u292D\u292E\u292F\u2930\u2931\u2932\u2933\u2934\u2935\u2936\u2937\u2938\u2939\u293A\u293B\u293C\u293D\u293E\u293F\u2940\u2942\u2943\u2944\u2945\u2946\u2947\u2948\u2949\u294A\u294B\u294C\u294E\u2951\u2952\u2953\u2954\u2955\u2956\u2957\u2958\u2959\u295A\u295B\u295C\u295E\u295F\u2960\u2961\u2962\u2963\u2964\u2965\u2966\u2967\u2968\u2969\u296A\u296B\u296C\u296D\u296E\u296F\u2970\u2971\u2972\u2973\u2974\u2975\u2976\u2977\u2978\u2979\u297A\u297B\u297C\u297D\u297E\u297F\uFFFD";        
}
